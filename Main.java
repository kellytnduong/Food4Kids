import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
      String[][] data = {
        {"11/4/2023 11:30:32","Kelly","Duong","Lackner Woods Public School","None","Sandwiches, vegetables, fruit, salads, etc.","Option 1","Every day","Every day","Every day","Once every three days","1","Yes","Stove","1","Once a week",""  },

        {"11/4/2023 11:32:01","Bob ","Bobber ","St. Nicholas Catholic Elementary School","Vegetarian","Sandwiches, vegetables, fruit, salads, etc.","Option 5","Every day","Every day","Every day","Once a week","1","Yes","Stove","2","Once a year",""  },

        {"11/4/2023 11:34:40","Asher ","Li","Keatsway Public School","None","Frozen Food","Option 1","Once a week","Once every three days","Every day","Once a month","4","No","Microwave","5","Never",""  },
        
        {"11/4/2023 11:36:48","Makala ","Joe ","Keatsway Public School","Halal","Fast food and soda","Option 8","Once a month","Once a week","Every day","Never","5","No","Microwave","5","Never",""  },

        {"11/4/2023 14:18:25","Oddish","Pochita","Chicopee Hills Public School","Halal","Sandwiches, vegetables, fruit, salads, etc.","Option 3","Once a month","Once a week","Every day","Once a month","3","Sometimes","Airfryer","2","Once a year",""  },

        {"11/4/2023 14:19:10","Jason","Smith ","Laurelwood Public School","None","Sandwiches, vegetables, fruit, salads, etc.","Option 7","Every day","Every day","Every day","Once every three days","1","Yes","Stove","1","Once a week",""  },

        {"11/4/2023 14:19:55","Eva ","Sharp ","Laurelwood Public School","None","Sandwiches, vegetables, fruit, salads, etc.","Option 2","Every day","Every day","Every day","Once every three days","1","Yes","Stove","2","Once a week",""  },

        {"11/4/2023 14:20:20","Chikorita","Alley","Chicopee Hills Public School","Nut-free","Sandwiches, vegetables, fruit, salads, etc.","Option 4","Once a month","Once a week","Once a week","Once every three days","2","No","Microwave","3","Once a year",""  },

        {"11/4/2023 14:21:50","Joey","Garret","St. Marys","Halal","Sandwiches, vegetables, fruit, salads, etc.","Option 1","Once a week","Once a month","Once every three days","Once a month","2","Sometimes","Stove","2","Once a month",""  },

        {"11/4/2023 14:21:54","Hello","Kitty","Chicopee Hills Public School","Gluten-free","Packaged Lunchables","Option 6","Once every 3 days","Every day","Every day","Once every three days","1","Yes","Stove","2","Once a month",""  },

        {"11/4/2023 14:22:23","Mabel","Diaz","Chaffey Burke Elementary","Vegetarian","Sandwiches, vegetables, fruit, salads, etc.","Option 3","Once a month","Once every three days","Once a week","Once every three days","3","No","Oven","2","Once a year",""  },

        {"11/4/2023 14:23:14","Ellis","Petkovic","Inman Elementary","Kosher","Frozen Food","Option 5","Once every 3 days","Once a week","Once a week","Once every three days","3","Sometimes","Stove","1","Once a year",""  },

        {"11/4/2023 14:23:37","Olivia","Annabob","St. Teresa of Cullcutta ","Halal, Nut-free","Packaged Lunchables","Option 7","Once a week","Once a week","Once every three days","Never","1","No","Microwave","1","Once a month",""  },

        {"11/4/2023 14:23:54","Avo","Cado","Chicopee Hills Public School","None","Frozen Food","Option 1","Once a month","Once a month","Once a week","Once a month","4","No","Microwave","2","Once a year",""  },

        {"11/4/2023 14:24:25","Annie","Xue","Chaffey Burke Elementary","Gluten-free","Fast food and soda","Option 7","Every day","Every day","Every day","Every day","2","No","Oven","2","Once a week",""  },

        {"11/4/2023 14:24:48","BillyBob","Patricia "," St. Marys","Kosher","Packaged Lunchables","Option 5","Every day","Once a month","Every day","Once a week","1","Yes","Stove","2","Once a week",""  },

        {"11/4/2023 14:25:14","Stanley ","Burton","Laurelwood Public School","Nut-free","Fast food and soda","Option 4","Once a month","Once a week","Once every three days","Once a month","4","No","Airfryer","4","Once a year",""  },

        {"11/4/2023 14:25:23","Anna","Kovtunenko","Chaffey Burke","Nut-free","Frozen Food","Option 7","Once a week","Once a year","Once a month","Once every three days","3","Yes","Oven","2","Once a year",""  },

        {"11/4/2023 14:26:03"," Mary","Cattipina","St. Teresa of Cullcutta ","Vegetarian","Frozen Food","Option 6","Once a week","Once a week","Once every three days","Once a month","2","No","Microwave","2","Once a year",""  },

        {"11/4/2023 14:26:35","Samuel","Zheng","Inman Elementary","None","Packaged Lunchables","Option 6","Once every 3 days","Every day","Once a year","Once a month","3","No","Airfryer","2","Once a month",""  },

        {"11/4/2023 14:27:10","Spri","Te","Lackner Woods Public School","Kosher","Packaged Lunchables","Option 1","Once every 3 days","Once a month","Once a year","Every day","2","Yes","Oven","4","Never",""  },

        {"11/4/2023 14:28:20","Alex","Hong","Chaffey Burke Elementary","None","Fast food and soda","Option 1","Once a week","Once a week","Never","Once every three days","4","No","Oven","2","Once a month",""  },
                      {"11/4/2023 14:28:45","Suffo","Cation","Lackner Woods Public School","None","Sandwiches, vegetables, fruit, salads, etc.","Option 2","Once every 3 days","Every day","Every day","Once every three days","1","Yes","Airfryer","2","Once a week",""  },

        {"11/4/2023 14:29:23","Lucas","Souza","Inman Elementary","Gluten-free","Frozen Food","Option 3","Every day","Once a week","Once a week","Once a week","2","No","Stove","1","Once a week",""  },

        {"11/4/2023 14:29:31","Anni","Ka","Lackner Woods Public School","Vegetarian","Sandwiches, vegetables, fruit, salads, etc.","Option 3","Every day","Every day","Every day","Once a week","3","Yes","Airfryer","1","Once a month",""  },

        {"11/4/2023 14:30:13","Welly ","Kim","St. Nicholas Catholic Elementary School","None","Sandwiches, vegetables, fruit, salads, etc.","Option 1","Once every 3 days","Every day","Every day","Once every three days","2","Sometimes","Oven","2","Once a month",""  },

        {"11/4/2023 14:30:14","Amy","Jiang","Chaffey Burke","Halal","Frozen Food","Option 9","Once a year","Once a year","Once a year","Once a year","4","Sometimes","Oven","3","Once a year",""  },

        {"11/4/2023 14:31:01","Cele","Bration","Chicopee Hills Public School","Halal","Sandwiches, vegetables, fruit, salads, etc.","Option 7","Once a week","Once every three days","Every day","Once every three days","4","Sometimes","Microwave","3","Never",""  },

        {"11/4/2023 14:31:12","Jeff","Cao","Inman Elementary","Vegan","Frozen Food","Option 4","Once a week","Once a week","Once a week","Once every three days","3","No","Stove","3","Once a month",""  },

        {"11/4/2023 14:32:42","Chain","Saw","Chicopee Hills Public School","Vegan, Nut-free","Frozen Food","Option 3","Once a month","Every day","Every day","Once every three days","3","Sometimes","Stove","1","Once a week",""  },

        {"11/4/2023 14:32:45","Kerby","Cycle ","St. Nicholas Catholic Elementary School","Halal, Nut-free","Sandwiches, vegetables, fruit, salads, etc.","Option 8","Every day","Every day","Every day","Once every three days","1","Yes","Oven","2","Once a week",""  }};
      ArrayList<String[]> tier1 = new ArrayList<>();
      ArrayList<String[]> tier2 = new ArrayList<>();
      ArrayList<String[]> tier3 = new ArrayList<>();

      for (int j=0; j<data.length; j++) {
          int score = q1(data[j][6]) + q2(data[j][7]) + q3(data[j][8]) + q4(data[j][9]) + q5(data[j][10]) + q6(data[j][11]) + q7(data[j][12]) + q8(data[j][13]) + q9(data[j][14]) + q10(data[j][15]);
          System.out.println(score);
          // Tier 1: Desperate need for help (malnutrition, hunger, food insecurity)
          if (score>=31) { 
              tier1.add(data[j]);
          }
          // Tier 2: Needs improvement
          else if (score<31 && score>=21) {
              tier2.add(data[j]);
          } 
          // Tier 3: Healthy 
          else{
              tier3.add(data[j]);
          }
      }
    }

  //Q1: What do your typical meals look like?
    static int q1(String a) {
      int result = 0;
      if (a=="Option 1") {
        result +=4;
      } else if (a=="Option 2") {
        result +=4;
      } else if (a=="Option 3") {
        result +=4;
      } else if (a=="Option 4") {
        result +=3;
      } else if (a=="Option 5") {
        result +=1;
      } else if (a=="Option 6") {
        result +=1;
      } else if (a=="Option 7") {
        result +=1;
      } else if (a=="Option 8") {
        result +=1;
      } else if (a=="Option 9") {
        result +=1;
      }
      return result;
    } 

  //Q2: How often do you have access to three full, healthy meals each day?
    static int q2(String a) {
      int result = 0;
      if (a=="Every day") {
        result = 1;
      } else if (a=="Once every 3 days") {
        result = 1;
      } else if (a=="Once a week") {
        result = 2;
      } else if (a=="Once a month") {
        result = 3;
      } else if (a=="Once a year") {
        result = 4;
      } else if (a=="Never") {
        result = 4;
      }
      return result;
    }
    
    //Q3: How often do you have access to two full, healthy meals each day?
    static int q3(String a) {
      int result = 0;
      if (a=="Every day") {
        result = 1;
      } else if (a=="Once every 3 days") {
        result = 1;
      } else if (a=="Once a week") {
        result = 2;
      } else if (a=="Once a month") {
        result = 3;
      } else if (a=="Once a year") {
        result = 4;
      } else if (a=="Never") {
        result = 4;
      }
      return result;
    }
        
        
    //Q4: How often do you have access to one full, healthy meal each day?
    static int q4(String a) {
      int num = 0;
      if (a=="Every day") {
        num = 1;
      } else if (a=="Once every three days") {
        num = 1;
      } else if (a=="Once a week") {
        num = 2;
      } else if (a=="Once a month") {
        num = 3;
      } else if (a=="Once a year") {
        num = 4;
      } else if (a=="Never") {
        num = 4;
      }
      return num;
    }
    
    //Q5: How often do you get to eat your favourite foods?
    static int q5(String a) {
      int num = 0;
      if (a=="Every day") {
        num = 1;
      } else if (a=="Once every three days") {
        num = 1;
      } else if (a=="Once a week") {
        num = 2;
      } else if (a=="Once a month") {
        num = 3;
      } else if (a=="Once a year") {
        num = 4;
      } else if (a=="Never") {
        num = 4;
      }
      return num;
    }
    
    
      //Q6:How hungry do you feel, even after you've eaten a meal?
    static int q6(String a) {
      int result = 0; 
      if (a=="1"){
        result = 1; 
      } else if (a=="2"){
        result = 2; 
      } else if (a=="3"){
        result = 3; 
      } else if (a=="4"){
        result = 4; 
      } else if (a=="5"){ 
        result = 5;
      } else if (a=="6"){ 
        result = 6; 
      }
      return result; 
    }
    
      //When you're eating at home, are you allowed/is there enough for second-helpings?
    static int q7(String a) {
      int result = 0; 
      if (a=="Yes"){
        result = 1; 
      } else if (a=="No"){
        result = 2; 
      } else if (a=="Sometimes"){
        result = 3; 
      } 
      return result; 
    }
    
      //What kitchen tool does your family use the most?
    static int q8(String a) {
      int result = 0; 
      if (a=="Stove"){
        result = 1; 
      } else if (a=="Oven"){
        result = 1; 
      } else if (a=="Microwave"){
        result = 3; 
      } else if (a=="Airfryer"){
        result = 2; 
      }
      return result; 
    }
    
      // How often are you allowed to pick out snacks when grocery shopping with your family?
    static int q9(String a) {
      int result = 0; 
      if (a=="1"){
        result = 1; 
      } else if (a=="2"){
        result = 2; 
      } else if (a=="3"){
        result = 3; 
      } else if (a=="4"){
        result = 4; 
      }   
      return result; 
    }
    
      // How often do you dress up and eat out at restaurants?
    static int q10(String a) {
      int result = 0; 
      if (a=="Once a week") {
        result = 1;
      } else if (a=="Once a month") { 
        result = 2;  
      } else if (a=="Once a year"){
        result = 3; 
      } else if (a=="Never"){
        result = 4; 
      }
      return result; 
    }

  } 

   