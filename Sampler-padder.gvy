import static java.util.Calendar.*

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

def mySleep = props.get("SLEEP") as Integer
sleep(mySleep)
def start=SampleResult.getStartTime()
def end = System.currentTimeMillis(); //return current time in milliseconds
def latency=end - start

msg=  "count=" + vars.getIteration() + " latency=" + latency
props.get("TRACER").msg(ctx,sampler,msg) 



