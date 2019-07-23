import static java.util.Calendar.*

def counterName="COUNTER"+"-"+Thread.currentThread().getName()
def counterVar=vars.get(counterName) as Integer
if ( counterVar == null ) {
	counterVar = 0
}
counterVar++
vars.put(counterName, counterVar.toString())
def padSize= props.get("PADSIZE") as Integer
def padding='X'.padLeft(padSize,'+')

def myListName="MYLIST"+"-"+Thread.currentThread().getName()
def myList=vars.getObject(myListName)
try {
  myList.add(padding)
} catch (Exception e) {
  myList=[]
  myList.add(padding)
}

vars.putObject(myListName,myList)

//sleep(1000)
def start=SampleResult.getStartTime()
def end = System.currentTimeMillis(); //return current time in milliseconds
def latency=end - start

msg=  "count=" + counterVar + " latency=" + latency
props.get("TRACER").msg(ctx,sampler,msg) 

