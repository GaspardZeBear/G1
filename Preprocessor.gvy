//props.put("PADSIZE",args[0])
OUT.println("PreProcessor starting")
padSize=props.get("PADSIZE")
if ( padSize == null ) {
   padSize="9999"
   props.put("PADSIZE",padSize)
}
OUT.println("PADSIZE=" + padSize) 
OUT.println("PreProcessor ending")
