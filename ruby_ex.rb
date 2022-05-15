# Programa de Ruby que crea un objeto con atributos

class Student
    def initialize(id, name, fee)
        @id   = id;
        @name = name;
        @fee  = fee;    
    end
    
    def PrintStudentInfo()
        print "Student Id:   ",@id,"\n";
        print "Student Name: ",@name,"\n";
        print "Student Fee:  ",@fee,"\n";
    end
end

obj = Student.new(101,"Pedro", 5000);

obj.PrintStudentInfo();