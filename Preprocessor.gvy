idx = vars.get('__jm__Thread Group__idx') as Integer
if (  idx > 0 ) {
  return 
}
props.get("TRACER").msg(ctx,sampler,"PreProcessor working")
padSize=props.get("PADSIZE")
if ( padSize == null ) {
   padSize="9999"
   props.put("PADSIZE",padSize)
}

props.get("TRACER").msg(ctx,sampler,"PADSIZE=" + padSize) 

