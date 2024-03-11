
public class Data {
    private int dia, diaJuliano, mes, ano;
    private String mesExtenso;

    public void setDia(int dia){
    this.dia = dia;
    }
    public int getDia(){
    return dia;
    }
    
    public void setMes(int mes){
    this.mes = mes;
    }
    public int getMes(){
    return mes;
    }
    
    public void setAno(int ano){
    this.ano = ano;
    }
    public int getAno(){
    return ano;
    }
    
    public void setDiaJuliano(int diaJuliano){
    this.diaJuliano = diaJuliano;
    }
    public int getDiaJuliano(){
    return diaJuliano;
    }
    
    public void setMesExtenso(String mesExtenso){
    this.mesExtenso = mesExtenso;
    }
    public String getMesExtenso(){
    return mesExtenso;
    }
    
    public void conversaoGregorianoparaJuliano(){

        
        switch(mes){   
            case 1: diaJuliano = dia; break;
            case 2: diaJuliano = 31 + dia; break;
            case 3: diaJuliano = 59 + dia; break;
            case 4: diaJuliano = 90 + dia; break;
            case 5: diaJuliano = 120 + dia; break;
            case 6: diaJuliano = 151 + dia; break;
            case 7: diaJuliano = 181 + dia; break;
            case 8: diaJuliano = 212 + dia; break;
            case 9: diaJuliano = 243 + dia; break;
            case 10: diaJuliano = 273 +dia; break;
            case 11: diaJuliano = 304 + dia; break;
            case 12: diaJuliano = 334 + dia; break;
        }
        
   
    
    }
    
public void converteJulianoGregorioExtenso(){
    if(diaJuliano >= 0 && diaJuliano<= 31){
        mesExtenso = "Janeiro";
    }
    if(diaJuliano >= 32 && diaJuliano <= 59){
    mesExtenso = "Fevereiro";
}
    if(diaJuliano >= 60 && diaJuliano <= 90){
       mesExtenso = "Março";
    }
    if(diaJuliano >= 91 && diaJuliano <= 120){
        mesExtenso = "Abril";
}
    if(diaJuliano >=121 && diaJuliano <= 151){
        mesExtenso = "Maio";
    }
    if(diaJuliano >= 152 && diaJuliano <= 181){
        mesExtenso = "Junho";
    }
    if(diaJuliano >= 182 && diaJuliano <= 212){
    mesExtenso = "Julho";
    }
    if(diaJuliano >= 213 && diaJuliano <= 243){
    mesExtenso = "Agosto";
    }
    if(diaJuliano >= 244 && diaJuliano <= 273){
        mesExtenso = "Setembro";
    }
    if(diaJuliano >= 274 && diaJuliano <= 304){
        mesExtenso = "Outubro";
    }
    if(diaJuliano >= 305 && diaJuliano <= 334){
        mesExtenso = "Novembro";
    }
    if(diaJuliano >= 335 && diaJuliano <= 365){
        mesExtenso = "Dezembro";
    }

}
    
    public void converteMesExtenso(){
        switch(mes){
            case 1: mesExtenso = "Janeiro"; break;
            case 2: mesExtenso = "Fevereiro"; break;
            case 3: mesExtenso = "Março"; break;
            case 4: mesExtenso = "Abril"; break;
            case 5: mesExtenso = "Maio"; break;
            case 6: mesExtenso = "Junho"; break;
            case 7: mesExtenso = "Julho"; break;
            case 8: mesExtenso = "Agosto"; break;
            case 9: mesExtenso = "Setembro"; break;
            case 10: mesExtenso = "Outubro"; break;
            case 11: mesExtenso = "Novembro"; break;
            case 12: mesExtenso = "Dezembro"; break;
        
        }
    
    }
                  
                  
                    
    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    
    }
    
    public Data(String mesExtenso, int dia, int ano){
        setMesExtenso(mesExtenso);
        setDia(dia);
        setAno(ano);
    
    }
    
    public Data(int diaJuliano, int ano){
        setDiaJuliano(diaJuliano);
        setAno(ano);
    
    }
    
    public void printGreogoriano(){
    System.out.println(mes + "/ " + dia + "/ " + ano);
    }
    public void printGregorianoExtenso(){
        System.out.println(mesExtenso + dia + ", " + ano);
    }
    public void printJuliano(){
    System.out.println(diaJuliano + ano);
    }
    
    
    
    
    }
    
    
    
    
    
    
    
    

    
    
    
}
