package calculator;
public class stack {
    public node Start=null;
    public node createnode(){
    return (new node());
    }
    public void push(String val){
        node temp=createnode();
        node l;
        temp.data=val;
        if(Start==null)
        {
            Start=temp;
            Start.link=null;
        }
        else 
        {
            l=Start;
            while(l.link!=null)
            {
                l=l.link;
            }
            l.link=temp;
            temp.link=null;
        }
    }
    public void pop(){
        node l,t;
        if(Start.link==null)
            Start=null;
        else if(Start!=null)
        {
            l=Start;
            t=Start;
            while(l.link!=null)
            {
                t=l;
                l=l.link;
            }
            t.link=null;
        }
    }
    public node deletenode(node k)
    {
        node l=Start;
        while(l.link!=k)
        {
            l=l.link;
        }
        l.link=k.link;
        return l.link;
    }
    public String calculation(){
        node l=Start;
            Double result=Double.valueOf("0");
        Double s1=Double.valueOf("0");
        if(Start==null)
            return "";
        try{
        while(l!=null)
        {
            if((!(l.data.equals("+")))&&(!(l.data.equals("-")))&&(!(l.data.equals("*")))&&(!(l.data.equals("/"))))
            {
                s1=Double.parseDouble(l.data);
                result = s1;
                l=l.link;
            }
            else
            {
                if(l.link==null){
                     return Double.toString(result);                    
                }
                else if(l.link.data.equals("+") || l.link.data.equals("-") || l.link.data.equals("*") || l.link.data.equals("/"))
                {                
                    l=l.link;
                  continue;
                }
               else{
                switch (l.data) {
                    case "+":
                        result=result+Double.parseDouble(l.link.data);
                        l=l.link.link;
                        break;
                    case "-":
                        result=result-Double.parseDouble(l.link.data);
                        l=l.link.link;
                        break;
                    case "*":
                        if(result==0)
                            result=1.0;
                        result=result*Double.parseDouble(l.link.data);
                        l=l.link.link;
                        break;
                    case "/":
                        result=result/Double.parseDouble(l.link.data);
                        l=l.link.link;
                        break;
                }
                }     
            }
        }
        }
        catch(Exception e)
        {
           if(e.getMessage().equals("empty String")){
                System.out.println("Exception occur "+e.getMessage());
            }else{
           new invalidInput();
            }
        }
        return Double.toString(result);
    }
    public void clearstack()
    {
        Start=null;
    }
}