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
def myVarName="MYVAR"+"-"+Thread.currentThread().getName()
def myVar=vars.get(myVarName)
def padSize= props.get("PADSIZE") as Integer
def padding='X'.padLeft(padSize,'+')
vars.put(myVarName,myVar + padding)
//sleep(1000)
def start=SampleResult.getStartTime()
def end = System.currentTimeMillis(); //return current time in milliseconds
def latency=end - start

def out=date.toString()  + " " + Thread.currentThread().getName() + " count=" + counterVar + " latency=" + latency 
log.info(out)
OUT.println(out)
