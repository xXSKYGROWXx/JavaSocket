package it.fi.itismeucci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        while(true){
        ServerStr servente = new ServerStr();
        servente.attendi();
        servente.comunica();
    }
    }
}
