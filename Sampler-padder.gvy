import static java.util.Calendar.*

def scriptName="A"
//log.info(scriptName + " Jsr223 Sampler activating")
def date=new Date()
//OUT.println(date.toString()  + " " + scriptName + " Jsr223 Sampler activating " )

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
OUT.println(myList.size())
vars.putObject(myListName,myList)

//sleep(1000)
def start=SampleResult.getStartTime()
def end = System.currentTimeMillis(); //return current time in milliseconds
def latency=end - start

def out=date.toString()  + " " + Thread.currentThread().getName() + " count=" + counterVar + " latency=" + latency 
log.info(out)
OUT.println(out)
