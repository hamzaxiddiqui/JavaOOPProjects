import java.util.Scanner;
class mytest
{
Scanner sc=new Scanner(System.in);
mytest()
{
System.out.println("\n");
System.out.println("********************************************************************************");
System.out.println("\n*********************** E-Test for    Admission Purpose **********************");
System.out.println(" ");
System.out.println(" ");
System.out.println("********************************************************************************");
System.out.println("                                E n t e r N a m e ");
String name=sc.nextLine();
System.out.println(" ");
System.out.println("                                  W E L C O M E \n" +name);
System.out.println(" ");
System.out.println(" Please Read the Instructions Carefully Before You Start ");
System.out.println(" ");
System.out.println("This test consist of 5 Section " +"\nGeneral Knowledge " +"\nPhysics " +"\nEnglish "  +"\nMaths " );
System.out.println("Total 20 Questions Attempt All the Question");
System.out.println("\nResult will mention at the End of Test ");
System.out.println("\nPress 'S' for begin the Test ");
}
}
class mygk //general knowledge question
{
mygk()
{
System.out.println("\n***************************");
System.out.println("  General Knowledge Section  ");
System.out.println("***************************");
}

public void q1()
{
System.out.println("\nQ1: Who is the Current Army Cheif of Pakistan? ");
System.out.println(" ");
System.out.println("A: Raheel Sharif ");
System.out.println("B: Asif Ghafoor ");
System.out.println("C: Qamar Jawaid Bajwa ");
System.out.println("D: None of These ");
}
public void q2()
{
System.out.println("\nQ2: Which is the Biggest Province of Pakistan? ");
System.out.println(" ");
System.out.println("A: KPK ");
System.out.println("B: Punjab ");
System.out.println("C: Sindh ");
System.out.println("D: Balochistan ");
}

public void q3()
{
System.out.println("\nQ3: Which Millitary Alliance had Pakistan as its member? ");
System.out.println(" ");
System.out.println("A: SEATO ");
System.out.println("B: CENTO ");
System.out.println("C: NATO ");
System.out.println("D: WARSAW PACT ");
}

public void q4()
{
System.out.println("\nQ4: What is the meaning of Pakistan? ");
System.out.println(" ");
System.out.println("A: Plane Land ");
System.out.println("B: Barren Land");
System.out.println("C: Holy Land ");
System.out.println("D: None of these ");
}
public void q5()
{
System.out.println("\nQ5: The National Flag of Pakistan was designed by? ");
System.out.println(" ");
System.out.println("A: Hafeez Jalandhari ");
System.out.println("B: Ahmed G.Chagla ");
System.out.println("C: Liaquat Ali Khan ");
System.out.println("D: Amiruddin Kidwai");
}
}

class myphy //physics questions
{
myphy()
{
System.out.println("\n***************************");
System.out.println("     Physics Section     ");
System.out.println("***************************");
}

public void q1()
{
System.out.println("\nQ1: The information from far side of the Universe are gathered by? ");
System.out.println(" ");
System.out.println("A: Telescope ");
System.out.println("B: Radio Telescope ");
System.out.println("C: Spectro Scope ");
System.out.println("D: Microscope ");
}
public void q2()
{
System.out.println("\nQ2: The System International(SI) is built up from_____ types of units? ");
System.out.println(" ");
System.out.println("A: Four ");
System.out.println("B: Three ");
System.out.println("C: One ");
System.out.println("D: Two ");
}
public void q3()
{
System.out.println("\nQ3: Physics deals with the Study of? ");
System.out.println(" ");
System.out.println("A: Matter ");
System.out.println("B: Human Body ");
System.out.println("C: Energy ");
System.out.println("D: Both A&C ");
}
public void q4()
{
System.out.println("\nQ4: Pascal is the unit of? ");
System.out.println(" ");
System.out.println("A: Pressure ");
System.out.println("B: Power ");
System.out.println("C: Magnetic Field ");
System.out.println("D: Intensity of Light ");
}
public void q5()
{
System.out.println("\nQ5: Who gave the Law of Mass-Energy Equivalence i.e(E=MC^2) ");
System.out.println(" ");
System.out.println("A: Isaac Newton ");
System.out.println("B: Albert Einstein ");
System.out.println("C: Charles A.de Columb");
System.out.println("D: J.J Thomson ");
}
}

class myeng //english question
{
myeng()
{
System.out.println("\n***************************");
System.out.println("     English Section     ");
System.out.println("***************************");
}
public void q1()
{
System.out.println("\nQ1: Select the Suitable Preposition \n" +" Saleem amused us ____ jokes ");
System.out.println(" ");
System.out.println("A: Of ");
System.out.println("B: For ");
System.out.println("C: With ");
System.out.println("D: In ");
}
public void q2()
{
System.out.println("\nQ2: Choose the Correct Sentence out of Four Sentences given below ");
System.out.println(" ");
System.out.println("A: I regard Fareed my Brother");
System.out.println("B: I regard Fareed as my Brother");
System.out.println("C: I regards Fareed as my Brother");
System.out.println("D: I does not regard Fareed as my Brother");
}
public void q3()
{
System.out.println("\nQ3: These Hunters have _____ a Deer ");
System.out.println(" ");
System.out.println("A: killed ");
System.out.println("B: kills ");
System.out.println("C: killing ");
System.out.println("D: kill ");
}
public void q4()
{
System.out.println("\nQ4: They _____ Left Pakistan before the end of the year ");
System.out.println(" ");
System.out.println("A: will have ");
System.out.println("B: were ");
System.out.println("C: will has ");
System.out.println("D: had been ");
}
public void q5()
{
System.out.println("\nQ5: Find the word with Correct Spelling ");
System.out.println(" ");
System.out.println("A: Divarce ");
System.out.println("B: Diverce ");
System.out.println("C: Diverc ");
System.out.println("D: Diverse ");
}
}
class mymath //math questions
{
mymath()
{
System.out.println("\n***************************");
System.out.println("      Maths Section      ");
System.out.println("***************************");
}
public void q1()
{
System.out.println("\nQ1: If A={1,3},B={1,2,3}, then AUB=____ ?");
System.out.println(" ");
System.out.println("A: {1,3} ");
System.out.println("B: {1} ");
System.out.println("C: {1,2,3} ");
System.out.println("D: {} ");
}
public void q2()
{
System.out.println("\nQ2: In sets the Universal set acts as_____ for Intersection ");
System.out.println(" ");
System.out.println("A: Even ");
System.out.println("B: Natural ");
System.out.println("C: Identity");
System.out.println("D: Non of them ");
}
public void q3()
{
System.out.println("\nQ3: The Rational Numbers p/q and q/p are called_____ inverse of each other ");
System.out.println(" ");
System.out.println("A: Rational ");
System.out.println("B: Additive ");
System.out.println("C: Reciprocal ");
System.out.println("D: Irrational ");
}
public void q4()
{
System.out.println("\nQ4: B Diffrences A is represented by ");
System.out.println(" ");
System.out.println("A: A-B ");
System.out.println("B: B-A ");
System.out.println("C: AUB ");
System.out.println("D: B/A ");
}
public void q5()
{
System.out.println("\nQ5: What is the Square root of √81 ");
System.out.println(" ");
System.out.println("A: 5 ");
System.out.println("B: 3 ");
System.out.println("C: 9 ");
System.out.println("D: 6 ");
}
}
class myetestproject // main class
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
String ans[]={"A","B","C","D"};// for anwers 
String ans1[]={"a","b","c","d"};
int gkq1=0;int gkq2=0;int gkq3=0;int gkq4=0;int gkq5=0; //g.k ans count
int phyq1=0;int phyq2=0;int phyq3=0;int phyq4=0;int phyq5=0; //physics ans count
int engq1=0;int engq2=0;int engq3=0;int engq4=0;int engq5=0; //english ans count
int mathq1=0;int mathq2=0;int mathq3=0;int mathq4=0;int mathq5=0; //maths ans count
mytest obj=new mytest();
String binput=sc.nextLine(); //for start the test
if(binput.equals("S") || binput.equals("s"))
{
mygk obj1=new mygk();//gk class object 
obj1.q1();
String gk1=sc.nextLine();// for input answer of gk q1
if(gk1.equals(ans[2])|| gk1.equals(ans1[2]))
{
gkq1=1;
}
obj1.q2();
String gk2=sc.nextLine();
if(gk2.equals(ans[3])|| gk2.equals(ans1[3]))
{
gkq2=1;
}
obj1.q3();
String gk3=sc.nextLine();
if(gk3.equals(ans[1])|| gk3.equals(ans1[1]))
{
gkq3=1;}
obj1.q4();
String gk4=sc.nextLine();
if(gk4.equals(ans[2])|| gk4.equals(ans1[2]))
{
gkq4=1;
}
obj1.q5();
String gk5=sc.nextLine();
if(gk5.equals(ans[3])||gk5.equals(ans1[3]))
{gkq5=1;
}int gkt=gkq1+gkq2+gkq3+gkq4+gkq5;
myphy obj2=new myphy();//physics class object
obj2.q1();
String phy1=sc.nextLine();
if(phy1.equals(ans[1])||phy1.equals(ans1[1]))
{
phyq1=1;}
obj2.q2();
String phy2=sc.nextLine();
if(phy2.equals(ans[1])||phy2.equals(ans1[1]))
{
phyq2=1;}
obj2.q3();
String phy3=sc.nextLine();
if(phy3.equals(ans[3])||phy3.equals(ans1[3]))
{
phyq3=1;}
obj2.q4();
String phy4=sc.nextLine();
if(phy4.equals(ans[0])||phy4.equals(ans1[0]))
{
phyq4=1;}
obj2.q5();
String phy5=sc.nextLine();
if(phy5.equals(ans[1])||phy5.equals(ans1[1]))
{phyq5=1;}
int phyt=phyq1+phyq2+phyq3+phyq4+phyq5;
myeng obj3=new myeng();//english class object
obj3.q1();
String eng1=sc.nextLine();
if(eng1.equals(ans[2])||eng1.equals(ans1[2]))
{engq1=1;}
obj3.q2();
String eng2=sc.nextLine();
if(eng2.equals(ans[1])||eng2.equals(ans1[1]))
{engq2=1;}
obj3.q3();
String eng3=sc.nextLine();
if(eng3.equals(ans[0])||eng3.equals(ans1[0]))
{engq3=1;}
obj3.q4();
String eng4=sc.nextLine();
if(eng4.equals(ans[0])||eng4.equals(ans1[0]))
{engq4=1;}
obj3.q5();
String eng5=sc.nextLine();
if(eng5.equals(ans[3])||eng5.equals(ans1[3]))
{engq5=1;}
int engt=engq1+engq2+engq3+engq4+engq5;
mymath obj4=new mymath();//Math class object
obj4.q1();
String math1=sc.nextLine();
if(math1.equals(ans[2])||math1.equals(ans1[2]))
{mathq1=1;}
obj4.q2();
String math2=sc.nextLine();
if(math2.equals(ans[3])||math2.equals(ans1[3]))
{mathq2=1;}
obj4.q3();
String math3=sc.nextLine();
if(math3.equals(ans[2])||math3.equals(ans1[2]))
{mathq3=1;}
obj4.q4();
String math4=sc.nextLine();
if(math4.equals(ans[1])||math4.equals(ans1[1]))
{mathq4=1;}
obj4.q5();
String math5=sc.nextLine();
if(math5.equals(ans[1])||math5.equals(ans1[1]))
{mathq5=1;}

int matht=mathq1+mathq2+mathq3+mathq4+mathq5;//math answer total
int anstotal=gkt+phyt+engt+matht;//over all test total
System.out.println("\n***********************************************");
System.out.println("\n***********************************************");
if(anstotal>=50)
{System.out.println("CONGRATULATION YOU HAVE CLEARED THE TEST ");}
if(anstotal<=50)
{System.out.println("BETTER LUCK NEXT TIME ");}

}
else 
{System.out.println("Please press 'S' ");
}
}
}