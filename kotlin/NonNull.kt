        fun main(){
            nameLength(null,"Presley")
        }
        fun nameLength(firstname : String?, lastname : String?):Unit{
            if(firstname==null){
                    println("Name: ${firstname} ${lastname}" )
            }
            if(lastname!=null){
                println("Name: ${firstname} ${lastname}" )
                println("First Name Length: ${firstname?.length} Last Name Length ${lastname.length}")
            }
        }