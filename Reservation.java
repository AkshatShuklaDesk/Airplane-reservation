import java.util.Scanner;
class Air
{
        public static void  plane()
        {
          System.out.println("\t\t\t\t\t\t\t\t\tSELECT YOUR DESTINATION");
          System.out.println("Press 1: Lucknow to Delhi");
          System.out.println("Press 2: Lucknow to Jammu");
          System.out.println("Press 3: Lucknow to Chandigarh");
          System.out.println("Press 4: Lucknow to Uttara Khand");
          System.out.println("Press 5: Lucknow to Haryana");
          System.out.println("Press 6: Lucknow to Ghaziabad");
          System.out.println("Press 7: Lucknow to Sri Lanka");
          System.out.println("Press 8: Lucknow to Mumbai");
          Scanner sc=new Scanner(System.in);
          int ch=sc.nextInt();
          switch(ch)
          {
              case 1:
            {
              System.out.println("You have selected Delhi");
              System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
              System.out.println("Press 1: 12:45 am --> 4:10 am");
              System.out.println("Press 2: 5:30 am --> 9:45 am");
              System.out.println("Press 3: 10:55 am --> 3:40 pm");
              System.out.println("Press 4: 4:50 pm --> 8:45 pm");
              System.out.println("Press 5: 9:50 pm --> 12:45 pm");
              int time=sc.nextInt();
              switch(time)
              {
                  case 1:
                  {
                      System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {System.out.println("Enter pin");
                      int n=sc.nextInt();
                      int c=0;
                      while(n!=0)
                      {
                          c++;
                          n/=10;
                      }
                       if(c==6)  
                       {
                           System.out.println("Paid");
                      }else{
                      System.out.println("Enter Valid Pin");
                      }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                  }
                  case 2:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                  case 3:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                  case 4:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                  case 5:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                    }
                }
                break;
            }
            case 2:
        {
            System.out.println("You have selected Jammu");
              System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
              System.out.println("Press 1: 12:50 am --> 5:10 am");
              System.out.println("Press 2: 6:30 am --> 9:45 am");
              System.out.println("Press 3: 10:35 am --> 2:40 pm");
              System.out.println("Press 4: 3:50 pm --> 9:45 pm");
              System.out.println("Press 5: 9:50 pm --> 12:50 pm");
              int time=sc.nextInt();
              switch(time)
              {
                  case 1:
                  {
                      System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 17000/-");}
                      break;
                  }
                  case 2:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 27000/-");}
                      break;
                    }
                  case 3:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 17000/-");}
                      break;
                    }
                  case 4:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 17500/-");}
                      break;
                    }
                  case 5:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 18500/-");}
                      break;
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                    }
                }
            break;
        }
        case 3:
        {
            System.out.println("You have selected Chandigarh");
            System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
            System.out.println("Press 1: 12:50 am --> 4:20 am");
            System.out.println("Press 2: 5:20 am --> 8:45 am");
            System.out.println("Press 3: 9:35 am --> 11:40 pm");
            System.out.println("Press 4: 11:50 pm --> 12:50 pm");
            int time=sc.nextInt();
            switch(time)
            {
                case 1:
                {
                    System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                    System.out.println("Press 1: Online Payment");
                    System.out.println("Press 2: Cash");
                    int select=sc.nextInt();
                    if(select==1)
                    {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                          c++;
                          n/=10;
                        }
                         if(c==6)  
                        {
                       System.out.println("Paid");
                       }else{
                       System.out.println("Enter Valid Pin");
                      }
                    }else{
                    System.out.println("Pay\nPaid 7000/-");}
                    break;
                }
                case 2:
                {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                    System.out.println("Press 1: Online Payment");
                    System.out.println("Press 2: Cash");
                    int select=sc.nextInt();
                    if(select==1)
                    {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                    }else{
                    System.out.println("Pay\nPaid 7000/-");}
                    break;
                  }
                case 3:
                {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                    System.out.println("Press 1: Online Payment");
                    System.out.println("Press 2: Cash");
                    int select=sc.nextInt();
                    if(select==1)
                    {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                    }else{
                    System.out.println("Pay\nPaid 7000/-");}
                    break;
                  }
                case 4:
                {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                    System.out.println("Press 1: Online Payment");
                    System.out.println("Press 2: Cash");
                    int select=sc.nextInt();
                    if(select==1)
                    {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                    }else{
                    System.out.println("Pay\nPaid 7000/-");}
                    break;
                  }
                  default:
                  {
                      System.out.println("Invalid Input");
                  }
              }
              break;
          } 
        case 4:
             {
              System.out.println("You have selected Uttara Khand");
              System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
              System.out.println("Press 1: 12:25 am --> 3:55 am");
              System.out.println("Press 2: 4:30 am --> 7:45 am");
              System.out.println("Press 3: 8:55 am --> 10:40 pm");
              System.out.println("Press 4: 10:50 pm --> 12:25 pm");
              int time=sc.nextInt();
              switch(time)
              {
                  case 1:
                  {
                      System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 17000/-");}
                      break;
                  }
                  case 2:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                  case 3:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                  case 4:
                  {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                      System.out.println("Press 1: Online Payment");
                      System.out.println("Press 2: Cash");
                      int select=sc.nextInt();
                      if(select==1)
                      {
                        System.out.println("Enter pin");
                        int n=sc.nextInt();
                        int c=0;
                        while(n!=0)
                        {
                            c++;
                            n/=10;
                        }
                         if(c==6)  
                         {
                             System.out.println("Paid");
                        }else{
                        System.out.println("Enter Valid Pin");
                        }
                      }else{
                      System.out.println("Pay\nPaid 7000/-");}
                      break;
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                    }
                }
                break;
    }
    case 5:
    {
        System.out.println("You have selected Haryana");
        System.out.println("\t\t\t\tKindly select suitable timings");
        System.out.println("Press 1: 12:45 am --> 4:10 am");
        System.out.println("Press 2: 5:30 am --> 9:45 am");
        System.out.println("Press 3: 10:55 am --> 3:40 pm");
        System.out.println("Press 4: 4:50 pm --> 8:45 pm");
        System.out.println("Press 5: 9:50 pm --> 12:45 pm");
        int time=sc.nextInt();
        switch(time)
        {
            case 1:
            {
                System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                System.out.println("Press 1: Online Payment");
                System.out.println("Press 2: Cash");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println("Enter pin");
                    int n=sc.nextInt();
                    int c=0;
                    while(n!=0)
                    {
                        c++;
                        n/=10;
                    }
                     if(c==6)  
                     {
                         System.out.println("Paid");
                    }else{
                    System.out.println("Enter Valid Pin");
                    }
                }else{
                System.out.println("Pay\nPaid 37000/-");}
                break;
            }
            case 2:
            {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                System.out.println("Press 1: Online Payment");
                System.out.println("Press 2: Cash");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println("Enter pin");
                    int n=sc.nextInt();
                    int c=0;
                    while(n!=0)
                    {
                        c++;
                        n/=10;
                    }
                     if(c==6)  
                     {
                         System.out.println("Paid");
                    }else{
                    System.out.println("Enter Valid Pin");
                    }
                }else{
                System.out.println("Pay\nPaid 37000/-");}
                break;
              }
            case 3:
            {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                System.out.println("Press 1: Online Payment");
                System.out.println("Press 2: Cash");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println("Enter pin");
                    int n=sc.nextInt();
                    int c=0;
                    while(n!=0)
                    {
                        c++;
                        n/=10;
                    }
                     if(c==6)  
                     {
                         System.out.println("Paid");
                    }else{
                    System.out.println("Enter Valid Pin");
                    }
                }else{
                System.out.println("Pay\nPaid 37000/-");}
                break;
              }
            case 4:
            {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                System.out.println("Press 1: Online Payment");
                System.out.println("Press 2: Cash");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println("Enter pin");
                    int n=sc.nextInt();
                    int c=0;
                    while(n!=0)
                    {
                        c++;
                        n/=10;
                    }
                     if(c==6)  
                     {
                         System.out.println("Paid");
                    }else{
                    System.out.println("Enter Valid Pin");
                    }
                }else{
                System.out.println("Pay\nPaid 37000/-");}
                break;
              }
            case 5:
            {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
                System.out.println("Press 1: Online Payment");
                System.out.println("Press 2: Cash");
                int select=sc.nextInt();
                if(select==1)
                {
                    System.out.println("Enter pin");
                    int n=sc.nextInt();
                    int c=0;
                    while(n!=0)
                    {
                        c++;
                        n/=10;
                    }
                     if(c==6)  
                     {
                         System.out.println("Paid");
                    }else{
                    System.out.println("Enter Valid Pin");
                    }
                }else{
                System.out.println("Pay\nPaid 37000/-");}
                break;
              }
              default:
              {
                  System.out.println("Invalid Input");
              }
          }
          break;
      }   
    case 6:
    {
    System.out.println("You have selected Chandigarh");
    System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
    System.out.println("Press 1: 12:20 am --> 3:10 am");
    System.out.println("Press 2: 4:30 am --> 7:45 am");
    System.out.println("Press 3: 10:55 am --> 3:40 pm");
    System.out.println("Press 4: 4:50 pm --> 8:45 pm");
    System.out.println("Press 5: 9:50 pm --> 12:45 pm");
    int time=sc.nextInt();
    switch(time)
    {
        case 1:
        {
            System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
        }
        case 2:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 3:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 4:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 5:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
          default:
          {
              System.out.println("Invalid Input");
          }
      }
      break;
  }
  case 7:
  {
    System.out.println("You have selected Sri Lanka");
    System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
    System.out.println("Press 1: 12:45 am --> 4:10 am");
    System.out.println("Press 2: 5:30 am --> 9:45 am");
    System.out.println("Press 3: 10:55 am --> 3:40 pm");
    System.out.println("Press 4: 4:50 pm --> 8:45 pm");
    System.out.println("Press 5: 9:50 pm --> 12:45 pm");
    int time=sc.nextInt();
    switch(time)
    {
        case 1:
        {
            System.out.println("\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
        }
        case 2:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 3:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 4:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
        case 5:
        {System.out.println("\t\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 7000/-");}
            break;
          }
          default:
          {
              System.out.println("Invalid Input");
          }
      }
  }
  case 8:
  {
    System.out.println("You have selected Mumbai");
    System.out.println("\t\t\t\t\t\t\t\t\tKindly select suitable timings");
    System.out.println("Press 1: 12:45 am --> 4:10 am");
    System.out.println("Press 2: 5:30 am --> 9:45 am");
    System.out.println("Press 3: 10:55 am --> 3:40 pm");
    System.out.println("Press 4: 4:50 pm --> 8:45 pm");
    System.out.println("Press 5: 9:50 pm --> 12:45 pm");
    int time=sc.nextInt();
    switch(time)
    {
        case 1:
        {
            System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 47000/-");}
            break;
        }
        case 2:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 47000/-");}
            break;
          }
        case 3:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 47000/-");}
            break;
          }
        case 4:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 47000/-");}
            break;
          }
        case 5:
        {System.out.println("\t\t\t\t\t\t\t\t\tSELECT PAYMENT METHOD");
            System.out.println("Press 1: Online Payment");
            System.out.println("Press 2: Cash");
            int select=sc.nextInt();
            if(select==1)
            {
                System.out.println("Enter pin");
                int n=sc.nextInt();
                int c=0;
                while(n!=0)
                {
                    c++;
                    n/=10;
                }
                 if(c==6)  
                 {
                     System.out.println("Paid");
                }else{
                System.out.println("Enter Valid Pin");
                }
            }else{
            System.out.println("Pay\nPaid 47000/-");}
            break;
          }
          default:
          {
              System.out.println("Invalid Input");
          }
      }
  }

          }
        }

    }


 class Reservation
 {
     public static void main(String[]args)
     {
         Scanner sc=new Scanner(System.in);
          System.out.println("\t\t\t\t\t\t\t\t\tSELECT YOUR FLIGHT");
          System.out.println("Press 1: IndiGo");
          System.out.println("Press 2: Air India");
          System.out.println("Press 3: SpiceJet");
          System.out.println("Press 4: Go First");
          System.out.println("Press 5: AirAsia India");
          System.out.println("Press 6: Vistara");
          System.out.println("Press 7: Alliance Air");
          System.out.println("Press 8: TruJet");
          int flight=sc.nextInt();
          switch(flight)
          {
              case 1:
              {Air.plane();
            break;}
              case 2:
              {Air.plane();
            break;}
              case 3:
              {Air.plane();
            break;}
              case 4:
              {Air.plane();
            break;}
              case 5:
              {Air.plane();
            break;}
              case 6:
              {Air.plane();
            break;}
              case 7:
              {Air.plane();
            break;}
              case 8:
              {Air.plane();
            break;}
            default:
            {
                System.out.println("Invalid Input");
            }
          }
        }
    }

          