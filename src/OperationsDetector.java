public class OperationsDetector {
    public String operator (String text){
        if(text.contains("+")) return "+";
        else if(text.contains("-")) return "-";
        else if(text.contains("*")) return "*";
        else if(text.contains("/")) return "/";
        else if(text.contains("%")) return "%";
        return "";
    }
}
