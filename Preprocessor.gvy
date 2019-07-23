idx = vars.get('__jm__Thread Group__idx') as Integer
if (  idx > 0 ) {
  return 
}
props.get("TRACER").msg(ctx,sampler,"Parameter Sampler working")

def padSize=props.get("PADSIZE")
if ( padSize == null ) {
   padSize="9999"
   props.put("PADSIZE",padSize)
}

props.get("TRACER").msg(ctx,sampler,"PADSIZE=" + padSize) 

def sleep = props.get("SLEEP")
if ( sleep == null ) {
   sleep="0"
   props.put("SLEEP",sleep)
}

props.get("TRACER").msg(ctx,sampler,"SLEEP=" + sleep) 

