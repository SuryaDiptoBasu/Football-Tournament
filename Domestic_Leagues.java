import java.util.*;
public class Domestic_Leagues
{
    public static void main()
    {
        String tm1match1="-", tm1match2="-", tm1match3="-", tm1match4="-", tm1match5="-", tm1match6="-";
        String tm2match1="-", tm2match2="-", tm2match3="-", tm2match4="-", tm2match5="-", tm2match6="-";
        String tm3match1="-", tm3match2="-", tm3match3="-", tm3match4="-", tm3match5="-", tm3match6="-";
        String tm4match1="-", tm4match2="-", tm4match3="-", tm4match4="-", tm4match5="-", tm4match6="-";
        int grade=0;
        String first="", second="", third="", fourth="";
        int team1played=0, team2played=0, team3played=0, team4played=0;
        int team1won=0, team2won=0, team3won=0, team4won=0;
        int team1lost=0, team2lost=0, team3lost=0, team4lost=0;
        int team1drew=0, team2drew=0, team3drew=0, team4drew=0;
        String myteam="", oteam="";
        String fteam1="TBA", fteam2="TBA", tteam1="", tteam2="";
        int result1,result2,result3,result4,result5,result6;
        int score1,score2,score3,score4,score5,score6;
        int team3point=0,team1point=0,team2point=0,team4point=0;
        int team3grade=0,team1grade=0,team2grade=0,team4grade=0;
        String team1="", team2="", team3="", team4="", team="", venue="";
        String league="", venue1="", venue2="", venue3="", venue4="", venue5="", venue6="";
        int k=0,r=1,sco1=0,sco2=0,m=1,n=1,x=1,match=1,y=0,z=0,Sd=1,matchend=0;
        String pteam="",o1team="",o2team="",o3team="";
        int t1=0,t2=0,t3=0,t4=0;
        String tm1="", tm2="", tm3="", tm4="";
        int pteampoint=0, o1teampoint=0, o2teampoint=0, o3teampoint=0;
        String a="NR", b="NR", c="NR", d="NR", e="NR", f="NR", g="NR", h="NR", i="NR", j="NR";
        int OJump, OShoot;
        Scanner l = new Scanner(System.in);
        System.out.println("Choose a League");
        System.out.println("[Press 0 for Campeonato Brasileiro Serie A]");
        System.out.println("[Press 1 for English Premier League]");
        System.out.println("[Press 2 for La Liga]");
        System.out.println("[Press 3 for Bundesliga]");
        System.out.println("[Press 4 for French League]");
        System.out.println("[Press 5 for Serie A]");
        System.out.println("[Press 6 for Eredivisie]");
        System.out.println("[Press 7 for Major League Soccer]");
        System.out.println("[Press 8 for Premeira Liga]");
        System.out.println("[Press 9 for Indian Super League]");
        System.out.println("[Press 10 for Super League Greece]");
        System.out.println("[Press 11 for Scottish Premiership]");
        System.out.println("[Press 12 for Russian Premier League]");
        System.out.println("[Press 13 for English Football League]");
        System.out.println("[Press 14 for Serie A 2]");
        System.out.println("[Press 15 for French League 2]");
        System.out.println("[Press 16 for Bundesliga 2]");
        int League = l.nextInt();
        if(League==0)
        {
            league="Campeonato Brasileiro Serie A";
            team1="Fluminense";venue1="Estadio de Marcana, Rio de Janeiro";tm1="FLU";
            team2="Chapecoense C.F";venue2="Area Conda Chapeco, Santa Catarina";tm2="ACF";
            team3="Brasilia Legiao";venue3="Mane Garrincha, Brasilia";tm3="BLE";
            team4="Cruzeiro C.F";venue4="Mineirao, Belo Horizonte";tm4="CRU";
            venue6="Estadio de Marcana, Rio de Janeiro";
            venue5="Mane Garrincha, Brasilia";
        }
        else if(League==1)
        {
            league="English Premier League";
            team1="Arsenal";venue1="Emirates Stadium, London";tm1="ARS";
            team2="Chelsea";venue2="Stamford Bridge, London";tm2="CHE";
            team3="Manchester City";venue3="Etihad Stadium, Manchester";tm3="MCI";
            team4="Manchester United";venue4="Old Trafford, Manchester";tm4="MUN";
            venue6="Wembley Stadium, London";
            venue5="Twickenham Stadium, London";
        }
        else if(League==2)
        {
            league="La Liga";
            team1="FC Barcelona";venue1="Camp Nou, Barcelona";tm1="BAR";
            team2="Atletico Madrid";venue2="Wanda Metropolitano, Madrid";tm2="ATM";
            team3="Real Madrid";venue3="Santiago Benrnabeu, Madrid";tm3="RMA";
            team4="Athletic Bilbao";venue4="San Mames, Bilbao";tm4="ATH";
            venue6="Camp Nou, Barcelona";
            venue5="Santiago Bernabeu, Madrid";
        }
        else if(League==3)
        {
            league="Bundesliga";
            team1="Bayern Munich";venue1="Allinaz Arena, Munich";tm1="BAM";
            team2="Bayer Leverkusen";venue2="Bay Arena, Leverkusen";tm2="BAL";
            team3="Borussia Dortmund";venue3="Signal Iduna Park, Dortmund";tm3="DOR";
            team4="R.B. Leipzig";venue4="Red Bull Arena, Leipzig";tm4="RBL";
            venue6="Olympastadion, Berlin";
            venue5="Esprit Arena, Dusseldorf";
        }
        else if(League==4)
        {
            league="French League";
            team1="Paris Saint Germain";venue1="Le Parc des Princes, Paris";tm1="PSG";
            team2="Olympique Lyonnais";venue2="Parc Olympique Lyonnais, Lyon";tm2="LYO";
            team3="Olympique Marseille";venue3="Orange Velodrome, Marseille";tm3="MAR";
            team4="A.S Monaco";venue4="Stade Louis II, Monaco";tm4="ASM";
            venue6="Stade de France, Saint-Denis";
            venue5="Stade Velodrome, Marseille";
        }
        else if(League==5)
        {
            league="Serie A";
            team1="Juventus";venue1="Allinaz Stadium, Turin";tm1="JUV";
            team2="Inter Milan";venue2="San Siro Stadium, Milan";tm2="INT";
            team3="S.S.C Napoli";venue3="San Paolo Stadium, Naples";tm3="NAP";
            team4="A.S Roma";venue4="Stadio Olimpico, Rome";tm4="ROM";
            venue6="San Siro Stadium, Milan";
            venue5="Stadio Olimpico, Rome";
        }
        else if(League==6)
        {
            league="Eredivisie";
            team1="Ajax Amsterdam";venue1="Johan Cryuff Arena, Amsterdam";tm1="AJX";
            team2="P.S.V Eindhoven";venue2="Philips Stadium, Eindhoven";tm2="PSV";
            team3="Feyenoord Rotterdam";venue3="Feyenoord Stadium, Rotterdam";tm3="FEY";
            team4="Vitesse Arnham";venue4="GelreDome, Arnhem";tm4="VIT";
            venue6="Johan Cruyff Arena, Amsterdam";
            venue5="Feyenoord Stadium, Rotterdam";
        }
        else if(League==7)
        {
            league="Major League Soccer";
            team1="New York Red Bulls";venue1="Red Bull Arena, New York";tm1="NYR";
            team2="D.C. United";venue2="Audi Field, Washington D.C";tm2="DCU";
            team3="L.A. Galaxy";venue3="Dignity Health Sports Park, Los Angeles";tm3="LAG";
            team4="Houston Dynamo";venue4="BBVA Compass Stadium, Texas";tm4="HOU";
            venue6="Allinaz Field, Saint Paul";
            venue5="Audi Field, Washington D.C";
        }
        else if(League==8)
        {
            league="Premeira Liga";
            team1="S.L Benfica";venue1="Estadio da Luz, Lisbon";tm1="BEN";
            team2="Sporting Lisbon";venue2="Estadio Jose Alvalade, Lisbon";tm2="SPO";
            team3="F.C Porto";venue3="Estadio do Dragao, Porto";tm3="POR";
            team4="S.C Braga";venue4="Estadio Municipal de Braga, Braga";tm4="SCB";
            venue6="Estadio da Luz, Lisbon";
            venue5="Estadio Jose Alvalade, Lisbon";
        }
        else if(League==9)
        {
            league="Indian Super League";
            team1="Kingfisher East Bengal";venue1="Salt Lake Stadium, Kolkata";tm1="KEB";
            team2="McCdowell Mohun Bagan";venue2="Salt Lake Stadium, Kolkata";tm2="MMB";
            team3="Bengaluru F.C";venue3="Sree Kanteerava Stadium, Bengaluru";tm3="BFC";
            team4="F.C Goa";venue4="Jawaharlal Nehru Stadium, Margao";tm4="FCG";
            venue6="Salt Lake Stadium, Kolkata";
            venue5="Jawaharlal Nehru Stadium, Kochi";
        }
        else if(League==10)
        {
            league="Super League Greece";
            team1="Panathinaikos F.C";venue1="Main Olympic Stadium, Athens";tm1="PAN";
            team2="Olympiacos F.C";venue2="Georgios Karaiskakis Stadium, Pireas";tm2="OLY";
            team3="A.E.K Athens F.C";venue3="Main Olympic Stadium, Athens";tm3="AEK";
            team4="PAOK F.C";venue4="Toumba Stadium, Thessaloniki";tm4="PAO";
            venue6="Main Olympic Stadium, Athens";
            venue5="Georgios Karaiskakis Stadium, Pireas";
        }
        else if(League==11)
        {
            league="Scottish Premiership";
            team1="Rangers F.C";venue1="Ibrox Stadium, Glasgow";tm1="RAN";
            team2="Celtic F.C";venue2="Celtic Park, Glasgow";tm2="CEL";
            team3="Motherwell F.C";venue3="Fir Park, Motherwell";tm3="MOT";
            team4="Aberdeen F.C";venue4="Pittodrie Stadium, Aberdeen";tm4="ABR";
            venue6="Celtic Park, Glasgow";
            venue5="Hampden Park, Glasgow";
        }
        else if(League==12)
        {
            league="Russian Premier League";
            team1="CSKA Moscow";venue1="VEB Arena, Moscow";tm1="CSK";
            team2="F.C Rostov";venue2="Rostov Arena, Rostov on Don";tm2="ROS";
            team3="Zenit St. Petersburg";venue3="Krestovsky Stadium, St. Petersburg";tm3="ZEN";
            team4="Spartak Moscow";venue4="Spartak Stadium, Moscow";tm4="SPA";
            venue6="Luzhniki Stadium, Moscow";
            venue5="Krestovsky Stadium, St. Petersburg";
        }
        else if(League==13)
        {
            league="English Football League";
            team1="Liverpool";venue1="Anfield Stadium, Goodison";tm1="LIV";
            team2="Tottenham Hotspur";venue2="Tottenham Hotspur Stadium, London";tm2="TOT";
            team3="Leicester City";venue3="King Power Stadium, Leicestor";tm3="LEI";
            team4="West Ham United";venue4="Bolyn Ground, London";tm4="WHU";
            venue6="Wembley Stadium, London";
            venue5="Twickenham Stadium, London";
        }
        else if(League==14)
        {
            league="Serie A 2";
            team1="A.C Milan";venue1="San Siro Stadium, Milan";tm1="MIL";
            team2="Lazio F.C";venue2="Stadio Olimpico, Rome";tm2="LAZ";
            team3="A.C.F Fiorentia";venue3="Artemio Franchi Stadium, Florence";tm3="FIO";
            team4="Atalanta B.C";venue4="Stadio Atletio Azzurri d'Italia, Bergamo";tm4="ATA";
            venue6="San Siro Stadium, Milan";
            venue5="Stadio Olimpico, Rome";
        }
        else if(League==15)
        {
            league="French League 2";
            team1="F.C Bordeaux";venue1="Matmut Atlantique, Bordeaux";tm1="BOR";
            team2="F.C Nantes";venue2="Stade de la Beaujoire, Nantes";tm2="NAN";
            team3="O.G.C Nice";venue3="Patrick Vieira, Nice";tm3="NIC";
            team4="Losc Lille F.C";venue4="Stade Pierre Mauroy, Lille";tm4="LIL";
            venue6="Stade de France, Saint-Denis";
            venue5="Stade Velodrome, Marseille";
        }
        else if(League==16)
        {
            league="Bundesliga 2";
            team1="Wolfsburg F.C";venue1="Volkswagen Arena, Wolfsburg";tm1="WOL";
            team2="Hertha Berlin S.C";venue2="Olympiastadion, Berlin";tm2="BER";
            team3="Borussia Monchengladbach F.C";venue3="Borussia Park, Monchengladbach";tm3="MON";
            team4="F.C Schlake 04";venue4="Veltins Arena, Schlake";tm4="SCH";
            venue6="Olympiastadion, Berlin";
            venue5="Allinaz Arena, Munich";
        }
        System.out.println(league.toUpperCase()+" 2019");
        System.out.println("Match #01: "+team1+" v "+team2+" ["+venue1+"]");
        System.out.println("Match #02: "+team3+" v "+team4+" ["+venue3+"]");
        System.out.println("Match #03: "+team3+" v "+team1+" ["+venue3+"]");
        System.out.println("Match #04: "+team4+" v "+team2+" ["+venue4+"]");
        System.out.println("Match #05: "+team4+" v "+team1+" ["+venue4+"]");
        System.out.println("Match #06: "+team2+" v "+team3+" ["+venue2+"]");
        System.out.println("Return League");
        System.out.println("Match #07: "+team2+" v "+team1+" ["+venue2+"]");
        System.out.println("Match #08: "+team4+" v "+team3+" ["+venue4+"]");
        System.out.println("Match #09: "+team1+" v "+team3+" ["+venue1+"]");
        System.out.println("Match #10: "+team2+" v "+team4+" ["+venue2+"]");
        System.out.println("Match #11: "+team1+" v "+team4+" ["+venue1+"]");
        System.out.println("Match #12: "+team3+" v "+team2+" ["+venue3+"]");
        System.out.println();
        System.out.println("Match #13: 3rd Place v 4th Place ["+venue5+"] {THIRD PLACE PLAYOFF}");
        System.out.println("Match #14: 1st Place v 2nd Place ["+venue6+"] {FINAL}");
        Scanner t = new Scanner(System.in);
        System.out.println("Choose your team");
        System.out.println("[Press 1 for "+team1+"]");
        System.out.println("[Press 2 for "+team2+"]");
        System.out.println("[Press 3 for "+team3+"]");
        System.out.println("[Press 4 for "+team4+"]");
        int team9 = t.nextInt();
        if(team9==1)
        {
            pteam=team1;
            o1team=team2;
            o2team=team3;
            o3team=team4;
        }
        else if(team9==2)
        {
            pteam=team2;
            o1team=team1;
            o2team=team3;
            o3team=team4;
        }
        else if(team9==3)
        {
            pteam=team3;
            o1team=team1;
            o2team=team2;
            o3team=team4;
        }
        else if(team9==4)
        {
            pteam=team4;
            o1team=team1;
            o2team=team2;
            o3team=team3;
        }
        System.out.println("Your Team: "+pteam);
        while(x<=6)
        {
            sco1=0;
            sco2=0;
            m=1;n=1;
            a="NR";b="NR";c="NR";d="NR";e="NR";
            f="NR";g="NR";h="NR";i="NR";j="NR";
            if(pteam.equals(team1))
            {
                if(x==1||x==4)
                {
                    team=team2;
                    team3played++;team4played++;
                    if(x==1)
                    {
                        venue=venue1;
                        match=1;
                        result1=(int)(Math.random() * 1);
                        score1=(int)(Math.random() * 1);
                        score1++;
                        if(result1==0)
                        {
                            System.out.println(team3+" defeated "+team4+" in Match #2");
                            team3point=team3point+3;
                            team3grade=team3grade+score1;
                            team4grade=team4grade-score1;
                            team3won++;team4lost++;
                            tm3match1="W";tm4match1="L";
                        }
                        else if(result1==1)
                        {
                            System.out.println(team4+" defeated "+team3+" in Match #2");
                            team4point=team4point+3;
                            team4grade=team4grade+score1;
                            team3grade=team3grade-score1;
                            team4won++;team3lost++;
                            tm4match1="W";tm3match1="L";
                        }
                    }
                    else if(x==4)
                    {
                        venue=venue2;
                        match=7;
                        result4=(int)(Math.random() * 1);
                        score4=(int)(Math.random() * 1);
                        score4++;
                        if(result4==0)
                        {
                            System.out.println(team4+" defeated "+team3+" in Match #8");
                            team4point=team4point+3;
                            team4grade=team4grade+score4;
                            team3grade=team3grade-score4;
                            team4won++;team3lost++;
                            tm4match4="W";tm3match4="L";
                        }
                        else if(result4==1)
                        {
                            System.out.println(team3+" defeated "+team4+" in Match #8");
                            team3point=team3point+3;
                            team3grade=team3grade+score4;
                            team4grade=team4grade-score4;
                            team3won++;team4lost++;
                            tm3match4="W";tm4match4="L";
                        }
                    }
                }
                else if(x==2||x==5)
                {
                    team=team3;
                    team2played++;team4played++;
                    if(x==2)
                    {
                        venue=venue3;
                        match=3;
                        result2=(int)(Math.random() * 1);
                        score2=(int)(Math.random() * 2);
                        score2++;
                        if(result2==0)
                        {
                            System.out.println(team2+" defeated "+team4+" in Match #3");
                            team2point=team2point+3;
                            team2grade=team2grade+score2;
                            team4grade=team4grade-score2;
                            team2won++;team4lost++;
                            tm2match2="W";tm4match2="L";
                        }
                        else if(result2==1)
                        {
                            System.out.println(team4+" defeated "+team2+" in Match #3");
                            team4point=team4point+3;
                            team4grade=team4grade+score2;
                            team2grade=team2grade-score2;
                            team4won++;team2lost++;
                            tm4match2="W";tm2match2="L";
                        }
                    }
                    else if(x==5)
                    {
                        venue=venue1;
                        match=9;
                        result5=(int)(Math.random() * 1);
                        score5=(int)(Math.random() * 2);
                        score5++;
                        if(result5==0)
                        {
                            System.out.println(team4+" defeated "+team2+" in Match #9");
                            team4point=team4point+3;
                            team4grade=team4grade+score5;
                            team2grade=team2grade-score5;
                            team4won++;team2lost++;
                            tm4match5="W";tm2match5="L";
                        }
                        else if(result5==1)
                        {
                            System.out.println(team2+" defeated "+team4+" in Match #9");
                            team2point=team2point+3;
                            team2grade=team2grade+score5;
                            team4grade=team4grade-score5;
                            team2won++;team4lost++;
                            tm2match5="W";tm4match5="L";
                        }
                    }
                }
                else if(x==3||x==6)
                {
                    team=team4;
                    team2played++;team3played++;
                    if(x==3)
                    {
                        venue=venue4;
                        match=5;
                        result3=(int)(Math.random() * 1);
                        score3=(int)(Math.random() * 3);
                        score3++;
                        if(result3==0)
                        {
                            System.out.println(team2+" defeated "+team3+" in Match #5");
                            team2point=team2point+3;
                            team2grade=team2grade+score3;
                            team3grade=team3grade-score3;
                            team2won++;team3lost++;
                            tm2match3="W";tm3match3="L";
                        }
                        else if(result3==1)
                        {
                            System.out.println(team3+" defeated "+team2+" in Match #5");
                            team3point=team3point+3;
                            team3grade=team3grade+score3;
                            team2grade=team2grade-score3;
                            team3won++;team2lost++;
                            tm3match3="L";tm2match3="W";
                        }
                    }
                    else if(x==6)
                    {
                        venue=venue1;
                        match=11;
                        result6=(int)(Math.random() * 1);
                        score6=(int)(Math.random() * 3);
                        score6++;
                        if(result6==0)
                        {
                            System.out.println(team3+" defeated "+team2+" in Match #11");
                            team3point=team3point+3;
                            team3grade=team3grade+score6;
                            team2grade=team2grade-score6;
                            team3won++;team2lost++;
                            tm3match6="W";tm2match6="L";
                        }
                        else if(result6==1)
                        {
                            System.out.println(team2+" defeated "+team3+" in Match #11");
                            team2point=team2point+3;
                            team2grade=team2grade+score6;
                            team3grade=team3grade-score6;
                            team2won++;team3lost++;
                            tm2match6="W";tm3match6="L";
                        }
                    }
                }
            }
            else if(pteam.equals(team2))
            {
                if(x==1||x==4)
                {
                    team=team1;
                    team3played++;team4played++;
                    if(x==1)
                    {
                        venue=venue1;
                        match=1;
                        result1=(int)(Math.random() * 1);
                        score1=(int)(Math.random() * 1);
                        score1++;
                        if(result1==0)
                        {
                            System.out.println(team3+" defeated "+team4+" in Match #2");
                            team3point=team3point+3;
                            team3grade=team3grade+score1;
                            team4grade=team4grade-score1;
                            team3won++;team4lost++;
                            tm3match1="W";tm4match1="L";
                        }
                        else if(result1==1)
                        {
                            System.out.println(team4+" defeated "+team3+" in Match #2");
                            team4point=team4point+3;
                            team4grade=team4grade+score1;
                            team3grade=team3grade-score1;
                            team4won++;team3lost++;
                            tm4match1="W";tm3match1="L";
                        }
                    }
                    else if(x==4)
                    {
                        venue=venue2;
                        match=7;
                        result4=(int)(Math.random() * 1);
                        score4=(int)(Math.random() * 1);
                        score4++;
                        if(result4==0)
                        {
                            System.out.println(team4+" defeated "+team3+" in Match #8");
                            team4point=team4point+3;
                            team4grade=team4grade+score4;
                            team3grade=team3grade-score4;
                            team4won++;team3lost++;
                            tm4match4="W";tm3match4="L";
                        }
                        else if(result4==1)
                        {
                            System.out.println(team3+" defeated "+team4+" in Match #8");
                            team3point=team3point+3;
                            team3grade=team3grade+score4;
                            team4grade=team4grade-score4;
                            team3won++;team4lost++;
                            tm3match4="W";tm4match4="L";
                        }
                    }
                }
                else if(x==2||x==5)
                {
                    team=team4;
                    team1played++;team3played++;
                    if(x==2)
                    {
                        venue=venue4;
                        match=4;
                        result2=(int)(Math.random() * 1);
                        score2=(int)(Math.random() * 2);
                        score2++;
                        if(result2==0)
                        {
                            System.out.println(team1+" defeated "+team3+" in Match #3");
                            team1point=team1point+3;
                            team1grade=team1grade+score2;
                            team3grade=team3grade-score2;
                            team1won++;team3lost++;
                            tm1match2="W";tm3match2="L";
                        }
                        else if(result2==1)
                        {
                            System.out.println(team3+" defeated "+team1+" in Match #3");
                            team3point=team3point+3;
                            team3grade=team3grade+score2;
                            team1grade=team1grade-score2;
                            team3won++;team1lost++;
                            tm3match2="W";tm1match2="L";
                        }
                    }
                    else if(x==5)
                    {
                        venue=venue2;
                        match=10;
                        result5=(int)(Math.random() * 1);
                        score5=(int)(Math.random() * 2);
                        score5++;
                        if(result5==0)
                        {
                            System.out.println(team3+" defeated "+team1+" in Match #9");
                            team3point=team3point+3;
                            team3grade=team3grade+score5;
                            team1grade=team1grade-score5;
                            team3won++;team1lost++;
                            tm3match5="W";tm1match5="L";
                        }
                        else if(result5==1)
                        {
                            System.out.println(team1+" defeated "+team3+" in Match #9");
                            team1point=team1point+3;
                            team1grade=team1grade+score5;
                            team3grade=team3grade-score5;
                            team1won++;team3lost++;
                            tm1match5="W";tm3match5="L";
                        }
                    }
                }
                else if(x==3||x==6)
                {
                    team=team3;
                    team1played++;team4played++;
                    if(x==3)
                    {
                        venue=venue2;
                        match=6;
                        result3=(int)(Math.random() * 1);
                        score3=(int)(Math.random() * 3);
                        score3++;
                        if(result3==0)
                        {
                            System.out.println(team1+" defeated "+team4+" in Match #5");
                            team1point=team1point+3;
                            team1grade=team1grade+score3;
                            team4grade=team4grade-score3;
                            team1won++;team4lost++;
                            tm1match3="W";tm4match3="L";
                        }
                        else if(result3==1)
                        {
                            System.out.println(team4+" defeated "+team1+" in Match #5");
                            team4point=team4point+3;
                            team4grade=team4grade+score3;
                            team1grade=team1grade-score3;
                            team4won++;team1lost++;
                            tm4match3="W";tm1match3="L";
                        }
                    }
                    else if(x==6)
                    {
                        venue=venue3;
                        match=12;
                        result6=(int)(Math.random() * 1);
                        score6=(int)(Math.random() * 3);
                        score6++;
                        if(result6==0)
                        {
                            System.out.println(team4+" defeated "+team1+" in Match #11");
                            team4point=team4point+3;
                            team4grade=team4grade+score6;
                            team1grade=team1grade-score6;
                            team4won++;team1lost++;
                            tm4match6="W";tm1match6="L";
                        }
                        else if(result6==1)
                        {
                            System.out.println(team1+" defeated "+team4+" ib Match #11");
                            team1point=team1point+3;
                            team1grade=team1grade+score6;
                            team4grade=team4grade-score6;
                            team1won++;team4lost++;
                            tm1match6="W";tm4match6="L";
                        }
                    }
                }
            }
            else if(pteam.equals(team3))
            {
                if(x==1||x==4)
                {
                    team=team4;
                    team1played++;team2played++;
                    if(x==1)
                    {
                        venue=venue3;
                        match=2;
                        result1=(int)(Math.random() * 1);
                        score1=(int)(Math.random() * 1);
                        score1++;
                        if(result1==0)
                        {
                            System.out.println(team1+" defeated "+team2+" in Match #1");
                            team1point=team1point+3;
                            team1grade=team1grade+score1;
                            team2grade=team2grade-score1;
                            team1won++;team2lost++;
                            tm1match1="W";tm2match1="L";
                        }
                        else if(result1==1)
                        {
                            System.out.println(team2+" defeated "+team1+" in Match #1");
                            team2point=team2point+3;
                            team2grade=team2grade+score1;
                            team1grade=team1grade-score1;
                            team2won++;team1lost++;
                            tm2match1="W";tm1match1="L";
                        }
                    }
                    else if(x==4)
                    {
                        venue=venue4;
                        match=8;
                        result4=(int)(Math.random() * 1);
                        score4=(int)(Math.random() * 1);
                        score4++;
                        if(result4==0)
                        {
                            System.out.println(team2+" defeated "+team1+" in Match #7");
                            team2point=team2point+3;
                            team2grade=team2grade+score4;
                            team1grade=team1grade-score4;
                            team2won++;team1lost++;
                            tm2match4="W";tm1match4="L";
                        }
                        else if(result4==1)
                        {
                            System.out.println(team1+" defeated "+team2+" in Match #7");
                            team1point=team1point+3;
                            team1grade=team1grade+score4;
                            team2grade=team2grade-score4;
                            team1won++;team2lost++;
                            tm1match4="W";tm2match4="L";
                        }
                    }
                }
                else if(x==2||x==5)
                {
                    team=team1;
                    team2played++;team4played++;
                    if(x==2)
                    {
                        venue=venue3;
                        match=3;
                        result2=(int)(Math.random() * 1);
                        score2=(int)(Math.random() * 2);
                        score2++;
                        if(result2==0)
                        {
                            System.out.println(team2+" defeated "+team4+" in Match #4");
                            team2point=team2point+3;
                            team2grade=team2grade+score2;
                            team4grade=team4grade-score2;
                            team2won++;team4lost++;
                            tm2match2="W";tm4match2="L";
                        }
                        else if(result2==1)
                        {
                            System.out.println(team4+" defeated "+team2+" in Match #4");
                            team4point=team4point+3;
                            team4grade=team4grade+score2;
                            team2grade=team2grade-score2;
                            team4won++;team2lost++;
                            tm4match2="W";tm2match2="L";
                        }
                    }
                    else if(x==5)
                    {
                        venue=venue1;
                        match=9;
                        result5=(int)(Math.random() * 1);
                        score5=(int)(Math.random() * 2);
                        score5++;
                        if(result5==0)
                        {
                            System.out.println(team4+" defeated "+team2+" in Match #10");
                            team4point=team4point+3;
                            team4grade=team4grade+score5;
                            team2grade=team2grade-score5;
                            team4won++;team2lost++;
                            tm4match5="W";tm2match5="L";
                        }
                        else if(result5==1)
                        {
                            System.out.println(team3+" defeated "+team4+" in Match #10");
                            team2point=team2point+3;
                            team2grade=team3grade+score5;
                            team4grade=team4grade-score5;
                            team2won++;team4lost++;
                            tm2match5="W";tm4match5="L";
                        }
                    }
                }
                else if(x==3||x==6)
                {
                    team=team2;
                    team1played++;team4played++;
                    if(x==3)
                    {
                        venue=venue2;
                        match=6;
                        result3=(int)(Math.random() * 1);
                        score3=(int)(Math.random() * 3);
                        score3++;
                        if(result3==0)
                        {
                            System.out.println(team1+" defeated "+team4+" in Match #5");
                            team1point=team1point+3;
                            team1grade=team1grade+score3;
                            team4grade=team4grade-score3;
                            team1won++;team4lost++;
                            tm1match3="W";tm4match3="L";
                        }
                        else if(result3==1)
                        {
                            System.out.println(team4+" defeated "+team1+" in Match #5");
                            team4point=team4point+3;
                            team4grade=team4grade+score3;
                            team1grade=team1grade-score3;
                            team4won++;team1lost++;
                            tm4match3="W";tm1match3="L";
                        }
                    }
                    else if(x==6)
                    {
                        venue=venue3;
                        match=12;
                        result6=(int)(Math.random() * 1);
                        score6=(int)(Math.random() * 3);
                        score6++;
                        if(result6==0)
                        {
                            System.out.println(team4+" defeated "+team1+" in Match #11");
                            team4point=team4point+3;
                            team4grade=team4grade+score6;
                            team1grade=team1grade-score6;
                            team4won++;team1lost++;
                            tm4match6="W";tm1match6="L";
                        }
                        else if(result6==1)
                        {
                            System.out.println(team1+" defeated "+team4+" in Match #11");
                            team1point=team1point+3;
                            team1grade=team1grade+score6;
                            team4grade=team4grade-score6;
                            team1won++;team4lost++;
                            tm1match6="W";tm4match6="L";
                        }
                    }
                }
            }
            else if(pteam.equals(team4))
            {
                if(x==1||x==4)
                {
                    team=team3;
                    team1played++;team2played++;
                    if(x==1)
                    {
                        venue=venue3;
                        match=2;
                        result1=(int)(Math.random() * 1);
                        score1=(int)(Math.random() * 1);
                        score1++;
                        if(result1==0)
                        {
                            System.out.println(team1+" defeated "+team2+" in Match #1");
                            team1point=team1point+3;
                            team1grade=team1grade+score1;
                            team2grade=team2grade-score1;
                            team1won++;team2lost++;
                            tm1match1="W";tm2match1="L";
                        }
                        else if(result1==1)
                        {
                            System.out.println(team2+" defeated "+team1+" in Match #1");
                            team2point=team2point+3;
                            team2grade=team2grade+score1;
                            team1grade=team1grade-score1;
                            team2won++;team1lost++;
                            tm2match1="W";tm1match1="L";
                        }
                    }
                    else if(x==4)
                    {
                        venue=venue4;
                        match=8;
                        result4=(int)(Math.random() * 1);
                        score4=(int)(Math.random() * 1);
                        score4++;
                        if(result4==0)
                        {
                            System.out.println(team2+" defeated "+team1+" in Match #7");
                            team2point=team2point+3;
                            team2grade=team2grade+score4;
                            team1grade=team1grade-score4;
                            team2won++;team1lost++;
                            tm2match4="W";tm1match4="L";
                        }
                        else if(result4==1)
                        {
                            System.out.println(team1+" defeated "+team2+" in Match #7");
                            team1point=team1point+3;
                            team1grade=team1grade+score4;
                            team2grade=team2grade-score4;
                            team1won++;team2lost++;
                            tm1match4="W";tm2match4="L";
                        }
                    }
                }
                else if(x==2||x==5)
                {
                    team=team2;
                    team1played++;team3played++;
                    if(x==2)
                    {
                        venue=venue4;
                        match=4;
                        result2=(int)(Math.random() * 1);
                        score2=(int)(Math.random() * 2);
                        score2++;
                        if(result2==0)
                        {
                            System.out.println(team1+" defeated "+team3+" in Match #3");
                            team1point=team1point+3;
                            team1grade=team1grade+score2;
                            team3grade=team3grade-score2;
                            team1won++;team3lost++;
                            tm1match2="W";tm3match2="L";
                        }
                        else if(result2==1)
                        {
                            System.out.println(team3+" defeated "+team1+" in Match #3");
                            team3point=team3point+3;
                            team3grade=team3grade+score2;
                            team1grade=team1grade-score2;
                            team3won++;team1lost++;
                            tm3match2="W";tm1match2="L";
                        }
                    }
                    else if(x==5)
                    {
                        venue=venue2;
                        match=10;
                        result5=(int)(Math.random() * 1);
                        score5=(int)(Math.random() * 2);
                        score5++;
                        if(result5==0)
                        {
                            System.out.println(team3+" defeated "+team1+" in Match #9");
                            team3point=team3point+3;
                            team3grade=team3grade+score5;
                            team1grade=team1grade-score5;
                            team3won++;team1lost++;
                            tm3match5="W";tm1match5="L";
                        }
                        else if(result5==1)
                        {
                            System.out.println(team1+" defeated "+team3+" in Match #9");
                            team1point=team1point+3;
                            team1grade=team1grade+score5;
                            team3grade=team3grade-score5;
                            team1won++;team3lost++;
                            tm1match5="W";tm3match5="L";
                        }
                    }
                }
                else if(x==3||x==6)
                {
                    team=team1;
                    team2played++;team3played++;
                    if(x==3)
                    {
                        venue=venue4;
                        match=5;
                        result3=(int)(Math.random() * 1);
                        score3=(int)(Math.random() * 3);
                        score3++;
                        if(result3==0)
                        {
                            System.out.println(team2+" defeated "+team3+" in Match #6");
                            team2point=team2point+3;
                            team2grade=team2grade+score3;
                            team3grade=team3grade-score3;
                            team2won++;team3lost++;
                            tm2match3="W";tm3match3="L";
                        }
                        else if(result3==1)
                        {
                            System.out.println(team3+" defeated "+team2+" in Match #6");
                            team3point=team3point+3;
                            team3grade=team3grade+score3;
                            team2grade=team2grade-score3;
                            team3won++;team2lost++;
                            tm3match3="W";tm2match3="L";
                        }
                    }
                    else if(x==6)
                    {
                        venue=venue1;
                        match=11;
                        result6=(int)(Math.random() * 1);
                        score6=(int)(Math.random() * 3);
                        score6++;
                        if(result6==0)
                        {
                            System.out.println(team3+" defeated "+team2+" in Match #6");
                            team3point=team3point+3;
                            team3grade=team3grade+score6;
                            team2grade=team2grade-score6;
                            team3won++;team2lost++;
                            tm3match6="W";tm2match6="L";
                        }
                        else if(result6==1)
                        {
                            System.out.println(team2+" defeated "+team3+" in Match #6");
                            team2point=team2point+3;
                            team2grade=team2grade+score6;
                            team3grade=team3grade-score6;
                            team2won++;team3lost++;
                            tm2match6="W";tm3match6="L";
                        }
                    }
                }
            }
            String YourDecision="", TossResult="";
            int TossR,OpponentDecision;
            char TossDecision;
            System.out.println("Match #"+match+": "+pteam+" V/S "+team);
            System.out.println("Venue: "+venue);
            System.out.println("Toss Session");
            Scanner To = new Scanner(System.in);
            System.out.println("Press 'h' or 't'");
            String TossD = To.nextLine();
            TossDecision=TossD.charAt(0);
            if(TossDecision=='h' || TossDecision=='H')
            YourDecision="HEADS";
            else if(TossDecision=='t' || TossDecision=='T')
            YourDecision="TAILS";
            TossR=(int)(Math.random() * 2);
            if(TossR==0)
            TossResult="HEADS";
            else if(TossR==1)
            TossResult="TAILS";
            if(YourDecision.equals(TossResult))
            {
                System.out.println("You have won the Toss");
                Scanner choose = new Scanner(System.in);
                System.out.println("Enter 1 to shoot first and Enter 2 to save first");
                int TossChoose = choose.nextInt();
                if(TossChoose==1)
                z=1;
                else if(TossChoose==2)
                z=2;
            }
            else 
            {
                System.out.println("Sorrry You have lost the toss");
                System.out.println(team+" will choose to shoot or save first");
                OpponentDecision=(int)(Math.random() * 2);
                if(OpponentDecision==0)
                z=1;
                else if(OpponentDecision==1)
                z=2;
            }
            if(z==1)
            {
                System.out.println(pteam+" will shoot first");
                while(m+n<=11)
                {
                    System.out.println(pteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+team);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(pteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(pteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        m++;
                        r=2;
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(team+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(team+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        if(m+n==11)
                        break; 
                        else
                        r=1;
                    }
                }
                System.out.println(pteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+team);
                if(sco1>sco2)
                {
                    grade=sco1-sco2;
                    if(pteam.equals(team1))
                    {
                        team1point=team1point+3;team1grade=team1grade+grade;team1won++;team1played++;
                        if(x==1)
                        tm1match1="W";
                        else if(x==2)
                        tm1match2="W";
                        else if(x==3)
                        tm1match3="W";
                        else if(x==4)
                        tm1match4="W";
                        else if(x==5)
                        tm1match5="W";
                        else if(x==6)
                        tm1match6="W";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2point=team2point+3;team2grade=team2grade+grade;team2won++;team2played++;
                        if(x==1)
                        tm2match1="W";
                        else if(x==2)
                        tm2match2="W";
                        else if(x==3)
                        tm2match3="W";
                        else if(x==4)
                        tm2match4="W";
                        else if(x==5)
                        tm2match5="W";
                        else if(x==6)
                        tm2match6="W";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3point=team3point+3;team3grade=team3grade+grade;team3won++;team3played++;
                        if(x==1)
                        tm3match1="W";
                        else if(x==2)
                        tm3match2="W";
                        else if(x==3)
                        tm3match3="W";
                        else if(x==4)
                        tm3match4="W";
                        else if(x==5)
                        tm3match5="W";
                        else if(x==6)
                        tm3match6="W";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4point=team4point+3;team4grade=team4grade+grade;team4won++;team4played++;
                        if(x==1)
                        tm4match1="W";
                        else if(x==2)
                        tm4match2="W";
                        else if(x==3)
                        tm4match3="W";
                        else if(x==4)
                        tm4match4="W";
                        else if(x==5)
                        tm4match5="W";
                        else if(x==6)
                        tm4match6="W";
                    }
                    if(team.equals(team1))
                    {
                        team1grade=team1grade-grade;team1lost++;team1played++;
                        if(x==1)
                        tm1match1="L";
                        else if(x==2)
                        tm1match2="L";
                        else if(x==3)
                        tm1match3="L";
                        else if(x==4)
                        tm1match4="L";
                        else if(x==5)
                        tm1match5="L";
                        else if(x==6)
                        tm1match6="L";
                    }
                    else if(team.equals(team2))
                    {
                        team2grade=team2grade-grade;team2lost++;team2played++;
                        if(x==1)
                        tm2match1="L";
                        else if(x==2)
                        tm2match2="L";
                        else if(x==3)
                        tm2match3="L";
                        else if(x==4)
                        tm2match4="L";
                        else if(x==5)
                        tm2match5="L";
                        else if(x==6)
                        tm2match6="L";
                    }
                    else if(team.equals(team3))
                    {
                        team3grade=team3grade-grade;team3lost++;team3played++;
                        if(x==1)
                        tm3match1="L";
                        else if(x==2)
                        tm3match2="L";
                        else if(x==3)
                        tm3match3="L";
                        else if(x==4)
                        tm3match4="L";
                        else if(x==5)
                        tm3match5="L";
                        else if(x==6)
                        tm3match6="L";
                    }
                    else if(team.equals(team4))
                    {
                        team4grade=team4grade-grade;team4lost++;team4played++;
                        if(x==1)
                        tm4match1="L";
                        else if(x==2)
                        tm4match2="L";
                        else if(x==3)
                        tm4match3="L";
                        else if(x==4)
                        tm4match4="L";
                        else if(x==5)
                        tm4match5="L";
                        else if(x==6)
                        tm4match6="L";
                    }
                    System.out.println(pteam+" defeated "+team+" by "+sco1+"-"+sco2);
                }
                else if(sco1==sco2)
                {
                    if(pteam.equals(team1))
                    {
                        team1point++;team1drew++;team1played++;
                        if(x==1)
                        tm1match1="D";
                        else if(x==2)
                        tm1match2="D";
                        else if(x==3)
                        tm1match3="D";
                        else if(x==4)
                        tm1match4="D";
                        else if(x==5)
                        tm1match5="D";
                        else if(x==6)
                        tm1match6="D";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2point++;team2drew++;team2played++;
                        if(x==1)
                        tm2match1="D";
                        else if(x==2)
                        tm2match2="D";
                        else if(x==3)
                        tm2match3="D";
                        else if(x==4)
                        tm2match4="D";
                        else if(x==5)
                        tm2match5="D";
                        else if(x==6)
                        tm2match6="D";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3point++;team3drew++;team3played++;
                        if(x==1)
                        tm3match1="D";
                        else if(x==2)
                        tm3match2="D";
                        else if(x==3)
                        tm3match3="D";
                        else if(x==4)
                        tm3match4="D";
                        else if(x==5)
                        tm3match5="D";
                        else if(x==6)
                        tm3match6="D";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4point++;team4drew++;team4played++;
                        if(x==1)
                        tm4match1="D";
                        else if(x==2)
                        tm4match2="D";
                        else if(x==3)
                        tm4match3="D";
                        else if(x==4)
                        tm4match4="D";
                        else if(x==5)
                        tm4match5="D";
                        else if(x==6)
                        tm4match6="D";
                    }
                    if(team.equals(team1))
                    {
                        team1point++;team1drew++;team1played++;
                        if(x==1)
                        tm1match1="D";
                        else if(x==2)
                        tm1match2="D";
                        else if(x==3)
                        tm1match3="D";
                        else if(x==4)
                        tm1match4="D";
                        else if(x==5)
                        tm1match5="D";
                        else if(x==6)
                        tm1match6="D";
                    }
                    else if(team.equals(team2))
                    {
                        team2point++;team2drew++;team2played++;
                        if(x==1)
                        tm2match1="D";
                        else if(x==2)
                        tm2match2="D";
                        else if(x==3)
                        tm2match3="D";
                        else if(x==4)
                        tm2match4="D";
                        else if(x==5)
                        tm2match5="D";
                        else if(x==6)
                        tm2match6="D";
                    }
                    else if(team.equals(team3))
                    {
                        team3point++;team3drew++;team3played++;
                        if(x==1)
                        tm3match1="D";
                        else if(x==2)
                        tm3match2="D";
                        else if(x==3)
                        tm3match3="D";
                        else if(x==4)
                        tm3match4="D";
                        else if(x==5)
                        tm3match5="D";
                        else if(x==6)
                        tm3match6="D";
                    }
                    else if(team.equals(team4))
                    {
                        team4point++;team4drew++;team4played++;
                        if(x==1)
                        tm4match1="D";
                        else if(x==2)
                        tm4match2="D";
                        else if(x==3)
                        tm4match3="D";
                        else if(x==4)
                        tm4match4="D";
                        else if(x==5)
                        tm4match5="D";
                        else if(x==6)
                        tm4match6="D";
                    }
                    System.out.println("Tied Match between "+pteam+" and "+team);
                }
                else if(sco1<sco2)
                {
                    grade=sco2-sco1;
                    if(team.equals(team1))
                    {
                        team1point=team1point+3;team1grade=team1grade+grade;team1won++;team1played++;
                        if(x==1)
                        tm1match1="W";
                        else if(x==2)
                        tm1match2="W";
                        else if(x==3)
                        tm1match3="W";
                        else if(x==4)
                        tm1match4="W";
                        else if(x==5)
                        tm1match5="W";
                        else if(x==6)
                        tm1match6="W";
                    }
                    else if(team.equals(team2))
                    {
                        team2point=team2point+3;team2grade=team2grade+grade;team2won++;team2played++;
                        if(x==1)
                        tm2match1="W";
                        else if(x==2)
                        tm2match2="W";
                        else if(x==3)
                        tm2match3="W";
                        else if(x==4)
                        tm2match4="W";
                        else if(x==5)
                        tm2match5="W";
                        else if(x==6)
                        tm2match6="W";
                    }
                    else if(team.equals(team3))
                    {
                        team3point=team3point+3;team3grade=team3grade+grade;team3won++;team3played++;
                        if(x==1)
                        tm3match1="W";
                        else if(x==2)
                        tm3match2="W";
                        else if(x==3)
                        tm3match3="W";
                        else if(x==4)
                        tm3match4="W";
                        else if(x==5)
                        tm3match5="W";
                        else if(x==6)
                        tm3match6="W";
                    }
                    else if(team.equals(team4))
                    {
                        team4point=team4point+3;team4grade=team4grade+grade;team4won++;team4played++;
                        if(x==1)
                        tm4match1="W";
                        else if(x==2)
                        tm4match2="W";
                        else if(x==3)
                        tm4match3="W";
                        else if(x==4)
                        tm4match4="W";
                        else if(x==5)
                        tm4match5="W";
                        else if(x==6)
                        tm4match6="W";
                    }
                    if(pteam.equals(team1))
                    {
                        team1grade=team1grade-grade;team1lost++;team1played++;
                        if(x==1)
                        tm1match1="L";
                        else if(x==2)
                        tm1match2="L";
                        else if(x==3)
                        tm1match3="L";
                        else if(x==4)
                        tm1match4="L";
                        else if(x==5)
                        tm1match5="L";
                        else if(x==6)
                        tm1match6="L";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2grade=team2grade-grade;team2lost++;team2played++;
                        if(x==1)
                        tm2match1="L";
                        else if(x==2)
                        tm2match2="L";
                        else if(x==3)
                        tm2match3="L";
                        else if(x==4)
                        tm2match4="L";
                        else if(x==5)
                        tm2match5="L";
                        else if(x==6)
                        tm2match6="L";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3grade=team3grade-grade;team3lost++;team3played++;
                        if(x==1)
                        tm3match1="L";
                        else if(x==2)
                        tm3match2="L";
                        else if(x==3)
                        tm3match3="L";
                        else if(x==4)
                        tm3match4="L";
                        else if(x==5)
                        tm3match5="L";
                        else if(x==6)
                        tm3match6="L";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4grade=team4grade-grade;team4lost++;team4played++;
                        if(x==1)
                        tm4match1="L";
                        else if(x==2)
                        tm4match2="L";
                        else if(x==3)
                        tm4match3="L";
                        else if(x==4)
                        tm4match4="L";
                        else if(x==5)
                        tm4match5="L";
                        else if(x==6)
                        tm4match6="L";
                    }
                    System.out.println(team+" defeated "+pteam+" by "+sco2+"-"+sco1);
                }
            }
            else if(z==2)
            {
                System.out.println(pteam+" will save first");
                r=2;
                while(m+n<=11)
                {
                    System.out.println(pteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+team);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(pteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(pteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        if(m+n==11)
                        break;
                        else 
                        {
                            m++;
                            r=2;
                        }
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(team+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(team+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        r=1;
                    }
                }
                System.out.println(pteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+team);
                if(sco1>sco2)
                {
                    grade=sco1-sco2;
                    if(pteam.equals(team1))
                    {
                        team1point=team1point+3;team1grade=team1grade+grade;team1won++;team1played++;
                        if(x==1)
                        tm1match1="W";
                        else if(x==2)
                        tm1match2="W";
                        else if(x==3)
                        tm1match3="W";
                        else if(x==4)
                        tm1match4="W";
                        else if(x==5)
                        tm1match5="W";
                        else if(x==6)
                        tm1match6="W";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2point=team2point+3;team2grade=team2grade+grade;team2won++;team2played++;
                        if(x==1)
                        tm2match1="W";
                        else if(x==2)
                        tm2match2="W";
                        else if(x==3)
                        tm2match3="W";
                        else if(x==4)
                        tm2match4="W";
                        else if(x==5)
                        tm2match5="W";
                        else if(x==6)
                        tm2match6="W";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3point=team3point+3;team3grade=team3grade+grade;team3won++;team3played++;
                        if(x==1)
                        tm3match1="W";
                        else if(x==2)
                        tm3match2="W";
                        else if(x==3)
                        tm3match3="W";
                        else if(x==4)
                        tm3match4="W";
                        else if(x==5)
                        tm3match5="W";
                        else if(x==6)
                        tm3match6="W";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4point=team4point+3;team4grade=team4grade+grade;team4won++;team4played++;
                        if(x==1)
                        tm4match1="W";
                        else if(x==2)
                        tm4match2="W";
                        else if(x==3)
                        tm4match3="W";
                        else if(x==4)
                        tm4match4="W";
                        else if(x==5)
                        tm4match5="W";
                        else if(x==6)
                        tm4match6="W";
                    }
                    if(team.equals(team1))
                    {
                        team1grade=team1grade-grade;team1lost++;team1played++;
                        if(x==1)
                        tm1match1="L";
                        else if(x==2)
                        tm1match2="L";
                        else if(x==3)
                        tm1match3="L";
                        else if(x==4)
                        tm1match4="L";
                        else if(x==5)
                        tm1match5="L";
                        else if(x==6)
                        tm1match6="L";
                    }
                    else if(team.equals(team2))
                    {
                        team2grade=team2grade-grade;team2lost++;team2played++;
                        if(x==1)
                        tm2match1="L";
                        else if(x==2)
                        tm2match2="L";
                        else if(x==3)
                        tm2match3="L";
                        else if(x==4)
                        tm2match4="L";
                        else if(x==5)
                        tm2match5="L";
                        else if(x==6)
                        tm2match6="L";
                    }
                    else if(team.equals(team3))
                    {
                        team3grade=team3grade-grade;team3lost++;team3played++;
                        if(x==1)
                        tm3match1="L";
                        else if(x==2)
                        tm3match2="L";
                        else if(x==3)
                        tm3match3="L";
                        else if(x==4)
                        tm3match4="L";
                        else if(x==5)
                        tm3match5="L";
                        else if(x==6)
                        tm3match6="L";
                    }
                    else if(team.equals(team4))
                    {
                        team4grade=team4grade-grade;team4lost++;team4played++;
                        if(x==1)
                        tm4match1="L";
                        else if(x==2)
                        tm4match2="L";
                        else if(x==3)
                        tm4match3="L";
                        else if(x==4)
                        tm4match4="L";
                        else if(x==5)
                        tm4match5="L";
                        else if(x==6)
                        tm4match6="L";
                    }
                    System.out.println(pteam+" defeated "+team+" by "+sco1+"-"+sco2);
                }
                else if(sco1==sco2)
                {
                    if(pteam.equals(team1))
                    {
                        team1point++;team1drew++;team1played++;
                        if(x==1)
                        tm1match1="D";
                        else if(x==2)
                        tm1match2="D";
                        else if(x==3)
                        tm1match3="D";
                        else if(x==4)
                        tm1match4="D";
                        else if(x==5)
                        tm1match5="D";
                        else if(x==6)
                        tm1match6="D";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2point++;team2drew++;team2played++;
                        if(x==1)
                        tm2match1="D";
                        else if(x==2)
                        tm2match2="D";
                        else if(x==3)
                        tm2match3="D";
                        else if(x==4)
                        tm2match4="D";
                        else if(x==5)
                        tm2match5="D";
                        else if(x==6)
                        tm2match6="D";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3point++;team3drew++;team3played++;
                        if(x==1)
                        tm3match1="D";
                        else if(x==2)
                        tm3match2="D";
                        else if(x==3)
                        tm3match3="D";
                        else if(x==4)
                        tm3match4="D";
                        else if(x==5)
                        tm3match5="D";
                        else if(x==6)
                        tm3match6="D";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4point++;team4drew++;team4played++;
                        if(x==1)
                        tm4match1="D";
                        else if(x==2)
                        tm4match2="D";
                        else if(x==3)
                        tm4match3="D";
                        else if(x==4)
                        tm4match4="D";
                        else if(x==5)
                        tm4match5="D";
                        else if(x==6)
                        tm4match6="D";
                    }
                    if(team.equals(team1))
                    {
                        team1point++;team1drew++;team1played++;
                        if(x==1)
                        tm1match1="D";
                        else if(x==2)
                        tm1match2="D";
                        else if(x==3)
                        tm1match3="D";
                        else if(x==4)
                        tm1match4="D";
                        else if(x==5)
                        tm1match5="D";
                        else if(x==6)
                        tm1match6="D";
                    }
                    else if(team.equals(team2))
                    {
                        team2point++;team2drew++;team2played++;
                        if(x==1)
                        tm2match1="D";
                        else if(x==2)
                        tm2match2="D";
                        else if(x==3)
                        tm2match3="D";
                        else if(x==4)
                        tm2match4="D";
                        else if(x==5)
                        tm2match5="D";
                        else if(x==6)
                        tm2match6="D";
                    }
                    else if(team.equals(team3))
                    {
                        team3point++;team3drew++;team3played++;
                        if(x==1)
                        tm3match1="D";
                        else if(x==2)
                        tm3match2="D";
                        else if(x==3)
                        tm3match3="D";
                        else if(x==4)
                        tm3match4="D";
                        else if(x==5)
                        tm3match5="D";
                        else if(x==6)
                        tm3match6="D";
                    }
                    else if(team.equals(team4))
                    {
                        team4point++;team4drew++;team4played++;
                        if(x==1)
                        tm4match1="D";
                        else if(x==2)
                        tm4match2="D";
                        else if(x==3)
                        tm4match3="D";
                        else if(x==4)
                        tm4match4="D";
                        else if(x==5)
                        tm4match5="D";
                        else if(x==6)
                        tm4match6="D";
                    }
                    System.out.println("Tied Match between "+pteam+" and "+team);
                }
                else if(sco1<sco2)
                {
                    grade=sco2-sco1;
                    if(team.equals(team1))
                    {
                        team1point=team1point+3;team1grade=team1grade+grade;team1won++;team1played++;
                        if(x==1)
                        tm1match1="W";
                        else if(x==2)
                        tm1match2="W";
                        else if(x==3)
                        tm1match3="W";
                        else if(x==4)
                        tm1match4="W";
                        else if(x==5)
                        tm1match5="W";
                        else if(x==6)
                        tm1match6="W";
                    }
                    else if(team.equals(team2))
                    {
                        team2point=team2point+3;team2grade=team2grade+grade;team2won++;team2played++;
                        if(x==1)
                        tm2match1="W";
                        else if(x==2)
                        tm2match2="W";
                        else if(x==3)
                        tm2match3="W";
                        else if(x==4)
                        tm2match4="W";
                        else if(x==5)
                        tm2match5="W";
                        else if(x==6)
                        tm2match6="W";
                    }
                    else if(team.equals(team3))
                    {
                        team3point=team3point+3;team3grade=team3grade+grade;team3won++;team3played++;
                        if(x==1)
                        tm3match1="W";
                        else if(x==2)
                        tm3match2="W";
                        else if(x==3)
                        tm3match3="W";
                        else if(x==4)
                        tm3match4="W";
                        else if(x==5)
                        tm3match5="W";
                        else if(x==6)
                        tm3match6="W";
                    }
                    else if(team.equals(team4))
                    {
                        team4point=team4point+3;team4grade=team4grade+grade;team4won++;team4played++;
                        if(x==1)
                        tm4match1="W";
                        else if(x==2)
                        tm4match2="W";
                        else if(x==3)
                        tm4match3="W";
                        else if(x==4)
                        tm4match4="W";
                        else if(x==5)
                        tm4match5="W";
                        else if(x==6)
                        tm4match6="W";
                    }
                    if(pteam.equals(team1))
                    {
                        team1grade=team1grade-grade;team1lost++;team1played++;
                        if(x==1)
                        tm1match1="L";
                        else if(x==2)
                        tm1match2="L";
                        else if(x==3)
                        tm1match3="L";
                        else if(x==4)
                        tm1match4="L";
                        else if(x==5)
                        tm1match5="L";
                        else if(x==6)
                        tm1match6="L";
                    }
                    else if(pteam.equals(team2))
                    {
                        team2grade=team2grade-grade;team2lost++;team2played++;
                        if(x==1)
                        tm2match1="L";
                        else if(x==2)
                        tm2match2="L";
                        else if(x==3)
                        tm2match3="L";
                        else if(x==4)
                        tm2match4="L";
                        else if(x==5)
                        tm2match5="L";
                        else if(x==6)
                        tm2match6="L";
                    }
                    else if(pteam.equals(team3))
                    {
                        team3grade=team3grade-grade;team3lost++;team3played++;
                        if(x==1)
                        tm3match1="L";
                        else if(x==2)
                        tm3match2="L";
                        else if(x==3)
                        tm3match3="L";
                        else if(x==4)
                        tm3match4="L";
                        else if(x==5)
                        tm3match5="L";
                        else if(x==6)
                        tm3match6="L";
                    }
                    else if(pteam.equals(team4))
                    {
                        team4grade=team4grade-grade;team4lost++;team4played++;
                        if(x==1)
                        tm4match1="L";
                        else if(x==2)
                        tm4match2="L";
                        else if(x==3)
                        tm4match3="L";
                        else if(x==4)
                        tm4match4="L";
                        else if(x==5)
                        tm4match5="L";
                        else if(x==6)
                        tm4match6="L";
                    }
                    System.out.println(team+" defeated "+pteam+" by "+sco2+"-"+sco1);
                }
            }
            System.out.println("TMS   M   W   L   D   P   G");
            System.out.println(tm1+"   "+team1played+"   "+team1won+"   "+team1lost+"   "+team1drew+"   "+team1point+"   "+team1grade);
            System.out.println(tm2+"   "+team2played+"   "+team2won+"   "+team2lost+"   "+team2drew+"   "+team2point+"   "+team2grade);
            System.out.println(tm3+"   "+team3played+"   "+team3won+"   "+team3lost+"   "+team3drew+"   "+team3point+"   "+team3grade);
            System.out.println(tm4+"   "+team4played+"   "+team4won+"   "+team4lost+"   "+team4drew+"   "+team4point+"   "+team4grade);
            System.out.println();
            System.out.println("  FORM   ");
            System.out.println(tm1+"  "+tm1match6+" "+tm1match5+" "+tm1match4+" "+tm1match3+" "+tm1match2+" "+tm1match1);
            System.out.println(tm2+"  "+tm2match6+" "+tm2match5+" "+tm2match4+" "+tm2match3+" "+tm2match2+" "+tm2match1);
            System.out.println(tm3+"  "+tm3match6+" "+tm3match5+" "+tm3match4+" "+tm3match3+" "+tm3match2+" "+tm3match1);
            System.out.println(tm4+"  "+tm4match6+" "+tm4match5+" "+tm4match4+" "+tm4match3+" "+tm4match2+" "+tm4match1);
            x++;
        }
        int size, temp;
        int array[] = {team1point, team2point, team3point, team4point};
        size=array.length;
        for(int u=0;u<size;u++)
        {
            for(int v=u+1;v<size;v++)
            {
                if(array[u]>array[v])
                {
                    temp=array[u];
                    array[u]=array[v];
                    array[v]=temp;
                }
            }
        }
        System.out.println("\n");
        System.out.println("1st team points: "+array[size-1]);
        System.out.println("2nd team points: "+array[size-2]);
        if(team1point==array[size-1])
        {
            fteam1=team1;
            if(team2point==array[size-2])
            {
                if(team2point==team3point)
                {
                    tteam2=team4;
                    if(team2grade>team3grade)
                    {
                        fteam2=team2;
                        tteam1=team3;
                    }
                    else if(team2grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team2;
                    }
                    else 
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team2;tteam1=team3;}
                        else if(result8==1)
                        {fteam2=team3;tteam1=team2;}
                    }
                }
                else if(team2point==team4point)
                {
                    tteam2=team3;
                    if(team2grade>team4grade)
                    {
                        fteam2=team2;
                        tteam1=team4;
                    }
                    else if(team2grade<team4grade)
                    {
                        fteam2=team4;
                        tteam1=team2;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team2;}
                        else if(result8==1)
                        {fteam2=team2;tteam1=team4;}
                    }
                }
                else
                {
                    fteam2=team2;
                    tteam1=team3;
                    tteam2=team4;
                }
            }
            else if(team3point==array[size-2])
            {
                if(team3point==team2point)
                {
                    tteam2=team4;
                    if(team3grade>team2grade)
                    {
                        fteam2=team3;
                        tteam1=team2;
                    }
                    else if(team2grade>team3grade)
                    {
                        fteam2=team2;
                        tteam1=team3;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team2;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team2;}
                    }
                }
                else if(team3point==team4point)
                {
                    tteam2=team2;
                    if(team3grade>team4grade)
                    {
                        fteam2=team3;
                        tteam1=team4;
                    }
                    else if(team3grade<team4grade)
                    {
                        fteam2=team4;
                        tteam1=team3;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team3;}
                        else 
                        {fteam2=team3;tteam1=team4;}
                    }
                }
                else
                {
                    fteam2=team3;
                    tteam1=team2;
                    tteam2=team4;
                }
            }
            else if(team4point==array[size-2])
            {
                if(team4point==team2point)
                {
                    tteam2=team3;
                    if(team4grade>team2grade)
                    {
                        fteam2=team4;
                        tteam1=team2;
                    }
                    else if(team4grade<team2grade)
                    {
                        fteam2=team2;
                        tteam1=team4;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team2;}
                        else
                        {fteam2=team2;tteam1=team4;}
                    }
                }
                else if(team4point==team3point)
                {
                    tteam2=team2;
                    if(team4grade>team3grade)
                    {
                        fteam2=team4;
                        tteam1=team3;
                    }
                    else if(team4grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team4;
                    }
                    else 
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team4;}
                    }
                }
                else
                {
                    fteam2=team4;
                    tteam1=team2;
                    tteam2=team3;
                }
            }
        }
        else if(team2point==array[size-1])
        {
            fteam1=team2;
            if(team3point==array[size-2])
            {
                if(team3point==team4point)
                {
                    tteam2=team1;
                    if(team3grade>team4grade)
                    {
                        fteam2=team3;
                        tteam1=team4;
                    }
                    else if(team4grade<team3grade)
                    {
                        fteam2=team4;
                        tteam1=team3;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team3;tteam1=team4;}
                        else    
                        {fteam2=team4;tteam1=team3;}
                    }
                }
                else if(team3point==team1point)
                {
                    tteam2=team4;
                    if(team3grade>team1grade)
                    {
                        fteam2=team3;
                        tteam1=team1;
                    }
                    else if(team3grade<team1grade)
                    {
                        fteam2=team4;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team1;}
                    }
                }
                else
                {
                    fteam2=team3;
                    tteam1=team1;
                    tteam2=team4;
                }
            }
            else if(team4point==array[size-2])
            {
                if(team4point==team1point)
                {
                    tteam2=team3;
                    if(team4grade>team1grade)
                    {
                        fteam2=team4;
                        tteam1=team1;
                    }
                    else if(team4grade<team1grade)
                    {
                        fteam2=team1;
                        tteam1=team4;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team1;}
                        else
                        {fteam2=team1;tteam1=team4;}
                    }
                }
                else if(team4point==team3point)
                {
                    tteam2=team2;
                    if(team4grade>team3grade)
                    {
                        fteam2=team4;
                        tteam1=team3;
                    }
                    else if(team4grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team4;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team3;}
                        else 
                        {fteam2=team2;tteam1=team4;}
                    }
                }
                else
                {
                    fteam2=team4;
                    tteam1=team3;
                    tteam2=team1;
                }
            }
            else if(team1point==array[size-2])
            {
                if(team1point==team3point)
                {
                    tteam2=team4;
                    if(team1grade>team3grade)
                    {
                        fteam2=team1;
                        tteam1=team3;
                    }
                    else if(team1grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team1;}
                    }
                }
                else if(team1point==team4point)
                {
                    tteam2=team3;
                    if(team1grade>team4grade)
                    {
                        fteam2=team1;
                        tteam1=team4;
                    }
                    else if(team1grade<team4grade)
                    {
                        fteam2=team4;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team1;}
                        else
                        {fteam2=team1;tteam1=team4;}
                    }
                }
            }
        }
        else if(team3point==array[size-1])
        {
            fteam1=team3;
            if(team1point==array[size-2])
            {
                if(team1point==team2point)
                {
                    tteam2=team4;
                    if(team1grade>team2grade)
                    {
                        fteam2=team1;
                        tteam1=team2;
                    }
                    else if(team1grade<team2grade)
                    {
                        fteam2=team2;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team2;}
                        else
                        {fteam2=team2;tteam1=team1;}
                    }
                }
                else if(team1point==team4point)
                {
                    tteam2=team2;
                    if(team1grade>team4grade)
                    {
                        fteam2=team1;
                        tteam1=team4;
                    }
                    else if(team1grade<team4grade)
                    {
                        fteam2=team4;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team4;}
                        else
                        {fteam2=team4;tteam1=team1;}
                    }
                }
                else
                {
                    fteam2=team1;
                    tteam1=team4;
                    tteam2=team2;
                }
            }
            else if(team2point==array[size-2])
            {
                if(team2point==team1point)
                {
                    tteam2=team4;
                    if(team2grade>team3grade)
                    {
                        fteam2=team2;
                        tteam1=team1;
                    }
                    else if(team2grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team1;}
                    }
                }
                else if(team2point==team4point)
                {
                    tteam2=team1;
                    if(team2grade>team4grade)
                    {
                        fteam2=team2;
                        tteam1=team4;
                    }
                    else if(team2grade<team4grade)
                    {
                        fteam2=team4;
                        tteam1=team2;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team2;tteam1=team4;}
                        else
                        {fteam2=team4;tteam1=team2;}
                    }
                }
                else
                {
                    fteam2=team2;
                    tteam1=team4;
                    tteam2=team1;
                }
            }
            else if(team4point==array[size-2])
            {
                if(team4point==team1point)
                {
                    tteam2=team2;
                    if(team4grade>team1grade)
                    {
                        fteam2=team4;
                        tteam1=team1;
                    }
                    else if(team4grade<team1grade)
                    {
                        fteam2=team1;
                        tteam1=team4;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team4;}
                        else
                        {fteam2=team4;tteam1=team1;}
                    }
                }
                else if(team4point==team2point)
                {
                    tteam2=team1;
                    if(team4grade>team2grade)
                    {
                        fteam2=team4;
                        tteam1=team2;
                    }
                    else if(team4grade<team2grade)
                    {
                        fteam2=team2;
                        tteam1=team4;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team4;tteam1=team2;}
                        else
                        {fteam2=team2;tteam1=team4;}
                    }
                }
                else
                {
                    fteam2=team4;
                    tteam1=team1;
                    tteam2=team2;
                }
            }
        }
        else if(team4point==array[size-1])
        {
            fteam1=team4;
            if(team1point==array[size-2])
            {
                if(team1point==team2point)
                {
                    tteam2=team3;
                    if(team1grade>team2grade)
                    {
                        fteam2=team1;
                        tteam1=team2;
                    }
                    else if(team1grade<team2grade)
                    {
                        fteam2=team2;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team2;}
                        else
                        {fteam2=team2;tteam1=team1;}
                    }
                }
                else if(team1point==team3point)
                {
                    tteam2=team2;
                    if(team1grade>team3grade)
                    {
                        fteam2=team1;
                        tteam1=team3;
                    }
                    else if(team1grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team1;
                    }
                    else 
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team1;}
                    }
                }
                else
                {
                    fteam2=team1;
                    tteam1=team2;
                    tteam2=team3;
                }
            }
            else if(team2point==array[size-2])
            {
                if(team2point==team1point)
                {
                    tteam2=team3;
                    if(team1grade>team2grade)
                    {
                        fteam2=team1;
                        tteam1=team2;
                    }
                    else if(team1grade<team2grade)
                    {
                        fteam2=team2;
                        tteam1=team1;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team2;}
                        else
                        {fteam2=team2;tteam1=team1;}
                    }
                }
                else if(team2point==team3point)
                {
                    tteam2=team1;
                    if(team2grade>team3grade)
                    {
                        fteam2=team2;
                        tteam1=team3;
                    }
                    else if(team2grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team2;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team2;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team2;}
                    }
                }
                else
                {
                    fteam2=team2;
                    tteam1=team1;
                    tteam1=team3;
                }
            }
            else if(team3point==array[size-2])
            {
                if(team3point==team1point)
                {
                    tteam2=team2;
                    if(team1grade>team3grade)
                    {
                        fteam2=team1;
                        tteam1=team3;
                    }
                    else if(team1grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team1;
                    }
                    else 
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team1;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team1;}
                    }
                }
                else if(team3point==team2point)
                {
                    tteam2=team1;
                    if(team2grade>team3grade)
                    {
                        fteam2=team2;
                        tteam1=team3;
                    }
                    else if(team2grade<team3grade)
                    {
                        fteam2=team3;
                        tteam1=team2;
                    }
                    else
                    {
                        int result8=(int)(Math.random() * 2);
                        if(result8==0)
                        {fteam2=team2;tteam1=team3;}
                        else
                        {fteam2=team3;tteam1=team2;}
                    }
                }
                else
                {
                    fteam2=team3;
                    tteam1=team1;
                    tteam2=team2;
                }
            }
        }
        System.out.println("Third Place Playoff: "+tteam1+" V/S "+tteam2+" ["+venue5+"]");
        System.out.println("Final: "+fteam1+" V/S "+fteam2+" ["+venue6+"]");
        a="NR";b="NR";c="NR";d="NR";e="NR";f="NR";g="NR";h="NR";i="NR";j="NR";
        sco1=0;sco2=0;m=1;n=1;
        if(fteam1.equals(pteam) || fteam2.equals(pteam))
        {
            int result7;
            result7=(int)(Math.random() * 1);
            if(result7==0)
            {
                System.out.println(tteam1+" defeated "+tteam2+" in "+venue5+" in Third Place Playoff");
                third=tteam1;
                fourth=tteam2;
            }
            else if(result7==1)
            {
                System.out.println(tteam2+" defeated "+tteam1+" in "+venue5+" in Third Place Playoff");
                third=tteam2;
                fourth=tteam1;
            }
            if(fteam1.equals(pteam))
            {myteam=fteam1;oteam=fteam2;}
            else if(fteam2.equals(pteam))
            {myteam=fteam2;oteam=fteam1;}
            System.out.println();
            System.out.println(myteam+" has succeded in qualifying for FINAL and will face "+oteam);
            System.out.println("Match #14: "+myteam+" v "+oteam);
            System.out.println("Venue: "+venue5);
            System.out.println("Toss Session");
            Scanner To = new Scanner(System.in);
            System.out.println("Press 'h' or 't'");
            String TossD = To.nextLine();
            char TossDecision;
            String YourDecision="", TossResult="";
            int TossR, OpponentDecision;
            TossDecision=TossD.charAt(0);
            if(TossDecision=='h' || TossDecision=='H')
            YourDecision="HEADS";
            else if(TossDecision=='t' || TossDecision=='T')
            YourDecision="TAILS";
            TossR=(int)(Math.random() * 2);
            if(TossR==0)
            TossResult="HEADS";
            else if(TossR==1)
            TossResult="TAILS";
            if(YourDecision.equals(TossResult))
            {
                System.out.println("You have won the Toss");
                Scanner choose = new Scanner(System.in);
                System.out.println("Enter 1 to shoot first and Enter 2 to save first");
                int TossChoose = choose.nextInt();
                if(TossChoose==1)
                z=1;
                else if(TossChoose==2)
                z=2;
            }
            else 
            {
                System.out.println("Sorrry You have lost the toss");
                System.out.println(team+" will choose to shoot or save first");
                OpponentDecision=(int)(Math.random() * 2);
                if(OpponentDecision==0)
                z=1;
                else if(OpponentDecision==1)
                z=2;
            }
            if(z==1)
            {
                System.out.println(pteam+" will shoot first");
                while(m+n<=11)
                {
                    System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(myteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(myteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        m++;
                        r=2;
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(oteam+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(oteam+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        if(m+n==11)
                        break; 
                        else
                        r=1;
                    }
                }
                System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                if(sco1>sco2)
                {
                    System.out.println(myteam+" has defeated "+oteam+" by "+sco1+"-"+sco2+" !!!!!!!!");
                    first=myteam;
                    second=oteam;
                    matchend=0;
                }
                else if(sco1<sco2)
                {
                    System.out.println(oteam+" has defeated "+myteam+" by "+sco2+"-"+sco1+" !!!!!!!!");
                    first=oteam;
                    second=myteam;
                    matchend=0;
                }
                else if(sco1==sco2)
                matchend=1;
                if(matchend==1)
                {
                    System.out.println("Sudden Death");
                    r=2;
                    m=10;
                    while(m>0)
                    {
                        System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                        if(r==1)
                        {
                            Scanner PS = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 to shoot");
                            int PShoot = PS.nextInt();
                            OJump=(int)(Math.random() * 8);
                            OJump++;
                            if(OJump==PShoot)
                            {
                                System.out.println(oteam+" has successfully saved the goal");
                                sco1=sco1;
                            }
                            else
                            {
                                System.out.println(myteam+" has scored the penalty");
                                sco1++;
                            }
                            if(sco1!=sco2)
                            break;
                            else
                            r=2;
                        }
                        else if(r==2)
                        {
                            Scanner PJ = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 jump");
                            int PJump = PJ.nextInt();
                            OShoot=(int)(Math.random() * 8);
                            OShoot++;
                            if(PJump==OShoot)
                            {
                                System.out.println(myteam+" has successfully saved the goal");
                                sco2=sco2;
                            }
                            else
                            {
                                System.out.println(oteam+" has scored the penalty");
                                sco2++;
                            }
                            r=1;
                        }
                    }
                    System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                    if(sco1>sco2)
                    {
                        System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" in Sudden Death !!!!!");
                        first=myteam;
                        second=oteam;
                    }
                    else if(sco1<sco2)
                    {
                        System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" in Sudden Death !!!!!");
                        first=oteam;
                        second=myteam;
                    }
                }
            }
            else if(z==2)
            {
                System.out.println(myteam+" will save first");
                r=2;
                while(m+n<=11)
                {
                    System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(myteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(myteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        if(m+n==11)
                        break;
                        else 
                        {
                            m++;
                            r=2;
                        }
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(oteam+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(oteam+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        r=1;
                    }
                }
                System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                if(sco1>sco2)
                {
                    System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" !!!!!!!");
                    first=myteam;
                    second=oteam;
                    matchend=0;
                }
                else if(sco2>sco1)
                {
                    System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" !!!!!!!");
                    first=oteam;
                    second=myteam;
                    matchend=0;
                }
                else if(sco2==sco1)
                matchend=1;
                if(matchend==1)
                {
                    System.out.println("Sudden Death");
                    r=1;
                    m=10;
                    while(m>0)
                    {
                        System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                        if(r==1)
                        {
                            Scanner PS = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 to shoot");
                            int PShoot = PS.nextInt();
                            OJump=(int)(Math.random() * 8);
                            OJump++;
                            if(OJump==PShoot)
                            {
                                System.out.println(oteam+" has successfully saved the goal");
                                sco1=sco1;
                            }
                            else
                            {
                                System.out.println(myteam+" has scored the penalty");
                                sco1++;
                            }
                            r=2;
                        }
                        else if(r==2)
                        {
                            Scanner PJ = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 jump");
                            int PJump = PJ.nextInt();
                            OShoot=(int)(Math.random() * 8);
                            OShoot++;
                            if(PJump==OShoot)
                            {
                                System.out.println(myteam+" has successfully saved the goal");
                                sco2=sco2;
                            }
                            else
                            {
                                System.out.println(oteam+" has scored the penalty");
                                sco2++;
                            }
                            if(sco1!=sco2)
                            break;
                            else
                            r=1;
                        }
                    }
                    System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                    if(sco1>sco2)
                    {
                        System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" in Sudden Death !!!!!");
                        first=myteam;
                        second=oteam;
                    }
                    else if(sco1<sco2)
                    {
                        System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" in Sudden Death !!!!!");
                        first=oteam;
                        second=myteam;
                    }
                }
            }
            System.out.println(first+" are the Champions of "+league);
            System.out.println(second+" have finished Runners Up");
            System.out.println(third+" have finished 3rd and "+fourth+" have finished 4th");
        }
        else if(tteam1.equals(pteam) || tteam2.equals(pteam))
        {
            if(tteam1.equals(pteam))
            {myteam=tteam1;oteam=tteam2;}
            else if(tteam2.equals(pteam))
            {myteam=tteam2;oteam=tteam1;}
            System.out.println();
            System.out.println(myteam+" has failed to qualify for FINAL but will face "+oteam+" in the THIRD PLACE PLAYOFF");
            System.out.println();
            System.out.println(myteam+" has succeded in qualifying for FINAL and will face "+oteam);
            System.out.println("Match #14: "+myteam+" v "+oteam);
            System.out.println("Venue: "+venue5);
            System.out.println("Toss Session");
            Scanner To = new Scanner(System.in);
            System.out.println("Press 'h' or 't'");
            String TossD = To.nextLine();
            char TossDecision;
            String YourDecision="", TossResult="";
            int TossR, OpponentDecision;
            TossDecision=TossD.charAt(0);
            if(TossDecision=='h' || TossDecision=='H')
            YourDecision="HEADS";
            else if(TossDecision=='t' || TossDecision=='T')
            YourDecision="TAILS";
            TossR=(int)(Math.random() * 2);
            if(TossR==0)
            TossResult="HEADS";
            else if(TossR==1)
            TossResult="TAILS";
            if(YourDecision.equals(TossResult))
            {
                System.out.println("You have won the Toss");
                Scanner choose = new Scanner(System.in);
                System.out.println("Enter 1 to shoot first and Enter 2 to save first");
                int TossChoose = choose.nextInt();
                if(TossChoose==1)
                z=1;
                else if(TossChoose==2)
                z=2;
            }
            else 
            {
                System.out.println("Sorrry You have lost the toss");
                System.out.println(team+" will choose to shoot or save first");
                OpponentDecision=(int)(Math.random() * 2);
                if(OpponentDecision==0)
                z=1;
                else if(OpponentDecision==1)
                z=2;
            }
            if(z==1)
            {
                System.out.println(pteam+" will shoot first");
                while(m+n<=11)
                {
                    System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(myteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(myteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        m++;
                        r=2;
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(oteam+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(oteam+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        if(m+n==11)
                        break; 
                        else
                        r=1;
                    }
                }
                System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                if(sco1>sco2)
                {
                    System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" !!!!!!!!");
                    third=myteam;
                    fourth=oteam;
                    matchend=0;
                }
                else if(sco2>sco1)
                {
                    System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" !!!!!!!!");
                    third=oteam;
                    fourth=myteam;
                    matchend=0;
                }
                else
                matchend=1;
                if(matchend==1)
                {
                    System.out.println("Sudden Death");
                    r=2;
                    m=10;
                    while(m>0)
                    {
                        System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                        if(r==1)
                        {
                            Scanner PS = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 to shoot");
                            int PShoot = PS.nextInt();
                            OJump=(int)(Math.random() * 8);
                            OJump++;
                            if(OJump==PShoot)
                            {
                                System.out.println(oteam+" has successfully saved the goal");
                                sco1=sco1;
                            }
                            else
                            {
                                System.out.println(myteam+" has scored the penalty");
                                sco1++;
                            }
                            if(sco1!=sco2)
                            break;
                            else
                            r=2;
                        }
                        else if(r==2)
                        {
                            Scanner PJ = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 jump");
                            int PJump = PJ.nextInt();
                            OShoot=(int)(Math.random() * 8);
                            OShoot++;
                            if(PJump==OShoot)
                            {
                                System.out.println(myteam+" has successfully saved the goal");
                                sco2=sco2;
                            }
                            else
                            {
                                System.out.println(oteam+" has scored the penalty");
                                sco2++;
                            }
                            r=1;
                        }
                    }
                    System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                    if(sco1>sco2)
                    {
                        System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" in Sudden Death");
                        third=myteam;
                        fourth=oteam;
                    }
                    else if(sco2>sco1)
                    {
                        System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" in Sudden Death");
                        third=oteam;
                        fourth=myteam;
                    }
                }
            }
            else if(z==2)
            {
                System.out.println(myteam+" will save first");
                r=2;
                while(m+n<=11)
                {
                    System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                    if(r==1)
                    {
                        Scanner PS = new Scanner(System.in);
                        System.out.println("Enter any number from 1 to 9 to shoot");
                        int PShoot = PS.nextInt();
                        OJump=(int)(Math.random() * 8);
                        OJump++;
                        if(PShoot==OJump)
                        {
                            System.out.println(myteam+" missed the Penalty");
                            if(m==1)
                            a="M";
                            else if(m==2)
                            b="M";
                            else if(m==3)
                            c="M";
                            else if(m==4)
                            d="M";
                            else if(m==5)
                            e="M";
                        }
                        else
                        {
                            System.out.println(myteam+" scored the Penalty");
                            if(m==1)
                            a="S";
                            else if(m==2)
                            b="S";
                            else if(m==3)
                            c="S";
                            else if(m==4)
                            d="S";
                            else if(m==5)
                            e="S";
                            sco1++;
                        }
                        if(m+n==11)
                        break;
                        else 
                        {
                            m++;
                            r=2;
                        }
                    }
                    else if(r==2)
                    {
                        Scanner PJ = new Scanner(System.in);
                        System.out.println("Enter any number between 1 to 9 to jump");
                        int PJump = PJ.nextInt();
                        OShoot=(int)(Math.random() * 8);
                        OShoot++;
                        if(OShoot==PJump)
                        {
                            System.out.println(oteam+" missed the Penalty");
                            if(n==1)
                            f="M";
                            else if(n==2)
                            g="M";
                            else if(n==3)
                            h="M";
                            else if(n==4)
                            i="M";
                            else if(n==5)
                            j="M";
                        }
                        else
                        {
                            System.out.println(oteam+" sscored the Penalty");
                            if(n==1)
                            f="S";
                            else if(n==2)
                            g="S";
                            else if(n==3)
                            h="S";
                            else if(n==4)
                            i="S";
                            else if(n==5)
                            j="S";
                            sco2++;
                        }
                        n++;
                        r=1;
                    }
                }
                System.out.println(myteam+"["+e+" "+d+" "+c+" "+b+" "+a+"]"+sco1+" V/S "+sco2+"["+f+" "+g+" "+h+" "+i+" "+j+"]"+oteam);
                if(sco1>sco2)
                {
                    System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" !!!!!!!");
                    third=myteam;
                    fourth=oteam;
                    matchend=0;
                }
                else if(sco2>sco1)
                {
                    System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" !!!!!!!");
                    third=oteam;
                    fourth=myteam;
                    matchend=0;
                }
                else if(sco2==sco1)
                matchend=1;
                if(matchend==1)
                {
                    System.out.println("Sudden Death");
                    r=1;
                    m=10;
                    while(m>0)
                    {
                        System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                        if(r==1)
                        {
                            Scanner PS = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 to shoot");
                            int PShoot = PS.nextInt();
                            OJump=(int)(Math.random() * 8);
                            OJump++;
                            if(OJump==PShoot)
                            {
                                System.out.println(oteam+" has successfully saved the goal");
                                sco1=sco1;
                            }
                            else
                            {
                                System.out.println(myteam+" has scored the penalty");
                                sco1++;
                            }
                            r=2;
                        }
                        else if(r==2)
                        {
                            Scanner PJ = new Scanner(System.in);
                            System.out.println("Press number between 1 to 9 jump");
                            int PJump = PJ.nextInt();
                            OShoot=(int)(Math.random() * 8);
                            OShoot++;
                            if(PJump==OShoot)
                            {
                                System.out.println(myteam+" has successfully saved the goal");
                                sco2=sco2;
                            }
                            else
                            {
                                System.out.println(oteam+" has scored the penalty");
                                sco2++;
                            }
                            if(sco1!=sco2)
                            break;
                            else
                            r=1;
                        }
                    }
                    System.out.println(myteam+" "+sco1+" : "+sco2+" "+oteam);
                    if(sco1>sco2)
                    {
                        System.out.println(myteam+" defeated "+oteam+" by "+sco1+"-"+sco2+" in Sudden Death !!!!!");
                        third=myteam;
                        fourth=oteam;
                    }
                    else if(sco1<sco2)
                    {
                        System.out.println(oteam+" defeated "+myteam+" by "+sco2+"-"+sco1+" in Sudden Death !!!!!");
                        third=oteam;
                        fourth=myteam;
                    }
                }
            }
            int result7;
            result7=(int)(Math.random() * 1);
            if(result7==0)
            {
                System.out.println(fteam1+" defeated "+fteam2+" to lift the Trophy!!!!!!!");
                first=fteam1;
                second=fteam2;
            }
            else if(result7==1)
            {
                System.out.println(fteam2+" defeated "+fteam1+" to lift the Trophy!!!!!!!");
                first=fteam2;
                second=fteam1;
            }
            System.out.println(first+" are the Champions of "+league);
            System.out.println(second+" have finished Runners Up");
            System.out.println(third+" have finished 3rd and "+fourth+" have finished 4th");
        }
    }
}