idx = vars.get('__jm__Thread Group__idx') as Integer
if (  idx > 0 ) {
  return 
}
OUT.println("PreProcessor working")
padSize=props.get("PADSIZE")
if ( padSize == null ) {
   padSize="9999"
   props.put("PADSIZE",padSize)
}
//OUT.println(vars.get('__jm__Thread Group__idx'))
OUT.println("PADSIZE=" + padSize) 
OUT.println("PreProcessor ending")
