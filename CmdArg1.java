class CmdArg1
{
    public static void main(String[]args)
    {
        if(args.length != 1)
        {
            System.out.println("Invalid argument or run in terminal");
            return;
        }
        int no = 0;
        try
        {
            no = Integer.parseInt(args[0]);//it return the integer (number) as pass string in numbers
        }
        catch(Exception e)
        {
            System.out.println("Invalid data");
            return;
        }
        String s = "Table\n";
        for(int i=1; i<=10; i++)
            s = s + " " + (no*i);
        System.out.println(s);
    }
}


// file name : CmdArg3.java
// Compilation : javac CmdArg4.java

// try calculating no, alphabet, -ve, +ve 


