package exceptionsDate;

public class MainDate {
	public static void main(String args[]){
		Date today;
		Date another;
		
	try{
	today=new Date(29,12,2017);
	another = new Date(27,03,2017);
	
	System.out.println(today.toString());
	System.out.println(another.toString());
	System.out.println(today.isSameDay(another));
	System.out.println(today.isSameMonth(another));
	System.out.println(today.isSameYear(another));
	System.out.println(today.isSame(another));
	System.out.println(today.countAllDaysYear(today));
	System.out.println(today.isSameDay2(another));
	System.out.println(today.isSameMonth2(another));
	System.out.println(today.isSameYear2(another));
	System.out.println(today.isSame2(another));
	System.out.println(today.nameMonth(today));
	System.out.println(today.rightDayMonth(another));
	System.out.println(today.seasonOfTheMonth(another));
	System.out.println(today.monthsLeftUntilEndOfTheYear(another));
	System.out.println(today.printDate(another));
	System.out.println(today.allDaysUntilEndMonth(another));
	System.out.println(today.countAllDaysYear(another));
	System.out.println(today.monthSameAmountDays(another));
	System.out.println(today.getNumDaysMonth(another));
	System.out.println(today.getNumGuessWhile(another));
	System.out.println(today.getNumGuess(today));
	System.out.println(today.getNumGuessDoWhile(today));
	System.out.println(today.dayOfWeek(today));
    
	}catch(DateException e){
				System.out.println(e.getMessage());
		}
	
	}
}




