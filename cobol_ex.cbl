* Programa que recibe una string como input e imprime lo mismo     

* Ejemplo - 
* 
        IDENTIFICATION DIVISION.                        
        PROGRAM-ID. PRG2.                               
        ENVIRONMENT DIVISION.                           
        DATA DIVISION.                                  
        WORKING-STORAGE SECTION.                        
        77 USERINP PIC A(10).                           
        PROCEDURE DIVISION.                             
               ACCEPT USERINP.                          
               DISPLAY "USER INPUT IS:" USERINP.        
               DISPLAY "HELLO WORLD!".                  
               STOP RUN.    