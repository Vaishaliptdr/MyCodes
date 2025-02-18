/*How to print ASCII value
 * 
 * ASCII acronym for American Standard Code for Information Interchange. 
 * It is a 7-bit character set contains 128 (0 to 127) characters. 
 * It represents the numerical value of a character. For example, the ASCII value of A is 65.
 * 
 * Dec  Char                           Dec  Char     Dec  Char     Dec  Char
---------                           ---------     ---------     ----------
  0  NUL (null)                      32  SPACE     64  @         96  `
  1  SOH (start of heading)          33  !         65  A         97  a
  2  STX (start of text)             34  "         66  B         98  b
  3  ETX (end of text)               35  #         67  C         99  c
  4  EOT (end of transmission)       36  $         68  D        100  d
  5  ENQ (enquiry)                   37  %         69  E        101  e
  6  ACK (acknowledge)               38  &         70  F        102  f
  7  BEL (bell)                      39  '         71  G        103  g
  8  BS  (backspace)                 40  (         72  H        104  h
  9  TAB (horizontal tab)            41  )         73  I        105  i
 10  LF  (NL line feed, new line)    42  *         74  J        106  j
 11  VT  (vertical tab)              43  +         75  K        107  k
 12  FF  (NP form feed, new page)    44  ,         76  L        108  l
 13  CR  (carriage return)           45  -         77  M        109  m
 14  SO  (shift out)                 46  .         78  N        110  n
 15  SI  (shift in)                  47  /         79  O        111  o
 16  DLE (data link escape)          48  0         80  P        112  p
 17  DC1 (device control 1)          49  1         81  Q        113  q
 18  DC2 (device control 2)          50  2         82  R        114  r
 19  DC3 (device control 3)          51  3         83  S        115  s
 20  DC4 (device control 4)          52  4         84  T        116  t
 21  NAK (negative acknowledge)      53  5         85  U        117  u
 22  SYN (synchronous idle)          54  6         86  V        118  v
 23  ETB (end of trans. block)       55  7         87  W        119  w
 24  CAN (cancel)                    56  8         88  X        120  x
 25  EM  (end of medium)             57  9         89  Y        121  y
 26  SUB (substitute)                58  :         90  Z        122  z
 27  ESC (escape)                    59  ;         91  [        123  {
 28  FS  (file separator)            60  <         92  \        124  |
 29  GS  (group separator)           61  =         93  ]        125  }
 30  RS  (record separator)          62  >         94  ^        126  ~
 31  US  (unit separator)            63  ?         95  _        127  DEL
**/

package javaPackage;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		
		/*Assigning a Variable to the int Variable*/
		
		// character whose ASCII value to be found  
		char ch1 = 'a';  
		char ch2 = 'b';  
		// variable that stores the integer value of the character  
		int asciivalue1 = ch1;  
		int asciivalue2 = ch2;  
		System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
		System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  


		int ch3 = 'c';  
		int ch4 = 'd';  
		System.out.println("The ASCII value of c is: "+ch3);  
		System.out.println("The ASCII value of d is: "+ch4); 	
		
		
		/*By using Type Casting*/
		
		//characters whose ASCII value to be found  
		char ch5 = 'e';  
		char ch6 = 'f';  
		//casting or converting a charter into int type  
		int ascii1 = (int) ch5;  
		int ascii2 = (int) ch6;  
		System.out.println("The ASCII value of " + ch5 + " is: " + ascii1);  
		System.out.println("The ASCII value of " + ch6 + " is: " + ascii2);  
		
		//By accepting character
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		//char chr = sc.next().charAt(0); 
		char chr = sc.next().charAt(0); //We need to enter index of string
		int asciiValue = chr;  
		System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
		sc.close();	
		
		/*ASCII values all*/
		for(int i = 0; i <= 255; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
		
	}

}
