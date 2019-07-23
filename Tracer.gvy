import static java.util.Calendar.*
def _SRC="Setup thread group"
_SRC += ctx.getThread().getThreadName() + " <" + sampler.getName() + ">"
def d=new Date()
println(d.toString() + "---------------------------------------------------------------------------------------")
println("Setup thread group - PreProcessor") 
 
public class Tracer {
     def log

     Tracer(log) {
     	this.log=log
     }

	void msg(ctx,sampler, msg) {
		def sign = ctx.getThread().getThreadName() + " <" + sampler.getName() + ">"
		def d = new Date()
		def dmsg = d.toString() + " <" + sign + "> " + msg
		this.log.info(dmsg)
		println(dmsg)
	}
}

props.put("TRACER",new Tracer(log))
println(d.toString() + "*************************************************************")
props.get("TRACER").msg(ctx,sampler,"Checking TRACER is OK")
