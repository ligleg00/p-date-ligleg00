package exceptionsDate;

public class Date {
		private int day;
		private int month;
		private int year;
		
		public Date(int day, int month, int year)throws DateException{
			if(month<1||month>12){
				throw new DateException("Mes "+month+" no válido. Valores posibles entre el 1 y el 12.");
			}else if(!rightDayMonth(day, month,year)){
				throw new DateException("Día "+day+" no válido. Valores posibles del 1 al 31.");
			}else{
				this.month=month;
				this.day=day;
			}
			
			this.year=year;
		}
		public String toString(){
			return this.day+"/"+this.month+"/"+this.year;
		}
		
			boolean isSameYear(Date another){
				if(this.year==another.year){
					return true;
				 }
				else{
					return false;
				 }
			 }
			 
			boolean isSameMonth(Date another){
				if(this.month==another.month){
					return true;
				 }
				else{
			                return false;
				 }
			 }

			boolean isSameDay(Date another){
				if(this.day==another.day){

					return true;
				 }
				else{
					return false;
				 }
			
			 }
			boolean isSame(Date another){
				if((this.year==another.year)&&(this.month==another.month)&&(this.day==another.day)){
					return true;
				}
				else{
					return false;
				}
			}
			
			boolean isSameDay2(Date another){
					return this.day==another.day;
						
			}
			boolean isSameMonth2(Date another){
					return this.month==another.month;
		    }
			boolean isSameYear2(Date another){
					return this.year==another.year;
		     }
			boolean isSame2(Date another){
					return (this.year==another.year)&&(this.month==another.month)&&(this.day==another.day);
		}
			
			 String nameMonth(Date another){
				 String name="";
				 switch(another.month){
					case 1:
							name="Enero";
							break;
					case 2:
							name="Febrero";
							break;
					case 3:
							name="Marzo";
							break;
					case 4:
							name="Abril";
							break;
					case 5:
							name="Mayo";
							break;
					case 6:
							name="Junio";
							break;
					case 7:
							name="Julio";
							break;
					case 8:
							name="Agosto";
							break;
					case 9:
							name="Septiembre";
							break;
					case 10:
							name="Octubre";
							break;
					case 11:
							name="Noviembre";
							break;
					case 12:
							name="Diciembre";
							break;
					default: 
							System.out.println("Número incorrecto, fuera de rango. Valores posibles del 1 al 12.");
						
				  }
				 return name;
				
			 }
			boolean rightDayMonth(int day,int month, int year){
				
				if( (day < 1) || (day > getNumDaysMonth(this.day)) ){
					return false;
				}
				return true;
				
			}
			String seasonOfTheMonth(Date another){
				String season="";
				switch(month){
				case 1:
						season = "Invierno";
				case 2://
				case 3://
						break;
				case 4:
						season = "Primavera";
				case 5://
				case 6://
						break;
				case 7:
						season = "Verano";
				case 8://
				case 9://
						break;
				case 10:
						season = "Otoño";
				case 11://
						break;
				case 12: 
						season = "Invierno";
						break;
				
				}
				return season;
			}

			 String monthsLeftUntilEndOfTheYear(Date another){
				 String name="";
				 switch(month){
					case 1:
							name="Enero";
					case 2:
							name="Febrero";
					case 3:
							name="Marzo";
					case 4:
							name="Abril";
					case 5:
							name="Mayo";
					case 6:
							name="Junio";
					case 7:
							name="Julio";
					case 8:
							name="Agosto";
					case 9:
							name="Septiembre";
					case 10:
							name="Octubre";
							
					case 11:
							name="Noviembre";
							
					case 12:
							name="Diciembre";
				 }
				 return name;
						
				  }
			String printDate(Date another){
			
				return day +"/"+ month + "/" + year;
			 }
			int allDaysUntilEndMonth(Date another){
			
				for(int i=1;i<=getNumDaysMonth(i);i++){
					int allDaysUntilEndMonth = getNumDaysMonth(i) + i;
				}
				return this.allDaysUntilEndMonth(this.day, this.month);
			}
			
			int countAllDaysYear(Date another){
				int counter = 0;
				for(int i=1;i<month;i++){
					counter = counter + getNumDaysMonth(i);
				}
				counter = counter + this.day;
				return counter;
			}
				 

			int monthSameAmountDays(Date another){
				for(int i=1;i<=12;i++){
					if(this.getNumDaysMonth(i)==this.getNumDaysMonth(this.month)){
						return this.getNumDaysMonth(this.month);
					 }
					else{
						System.out.println("Los meses introducidos no tienen la misma cantidad de días");
					 }
					 
					  }
				return monthSameAmountDays();
			 }
			
			 int getNumDaysMonth(Date another){
				int numDays=0;
					switch(month){
						case 1://
						case 3://
						case 5://
						case 12: numDays=31;
							 break;
						case 4://
						case 6://
						case 11: numDays=30;
							 break;
						case 2: numDays=28;
							 break;
					  }
			
				  return numDays;	
		}
			 int getNumGuessWhile(Date another) throws DateException{
				 int counter = 0;
				 Date randomDate;
				 boolean end = false;
				 while(!end){
					 randomDate = new Date(this.day,this.month, this.year);
					 counter++;
					 	if(this.equals(randomDate)){
					 		end = true;
					 	}
				   }
				 
				 return counter;  
				 }
			 int getNumGuess(Date another) throws DateException{
				 int counter = 0;
				 Date randomDate;
				 boolean end = false;
				 if(!end){
					 randomDate = new Date(this.day,this.month,this.year);
					 counter++;
					 	if(this.equals(randomDate)){
					 		end = true;
					 	}
				   }
				 
				 return counter;  
				 }
			 int getNumGuessDoWhile(Date another) throws DateException{
				 int counter = 0;
				 Date randomDate;
				 boolean end = false;
				 do{
					 randomDate = new Date(this.day,this.month,this.year);
					 counter++;
					 	if(this.equals(randomDate)){
					 		end = true;
					 	}
				   }while(end==false);
				   
				 
				 return counter;  
				 }
			 
				 
			 String dayOfWeek(Date another){
				 String nameDay="";
				 switch(month){
					case 1:
							nameDay="Lunes";
							break;
					case 2:
							nameDay="Martes";
							break;
					case 3:
							nameDay="Miércoles";
							break;
					case 4:
							nameDay="Jueves";
							break;
					case 5:
							nameDay="Viernes";
							break;
					case 6:
							nameDay="Sábado";
							break;
					case 7:
							nameDay="Domingo";
							break;
				 }
				 if(day>0 && day<366){
					 if (day<=7){
						 System.out.println(nameDay[day-1]);
					 }else if((day%7)==0){
						 System.out.println(nameDay[6]);
					 }else{
						 System.out.println(nameDay[(day-1) % 7]);
					 }while(day<1||day>365);
				 }
				
				
				 return nameDay;
			 }
			
}
		