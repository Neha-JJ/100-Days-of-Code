class Solution {
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            }else if (s.contains("{}")){
                s = s.replace("{}","");
            }else if(s.contains("[]")){
                s = s.replace("[]","");
            }else {
                return s.isEmpty();
            }
        }
    }
}



class Solution {
    public boolean isValid(String s) {
        for(int i = 0;i<s.length();i++){
            if(s.contains("()")){
                s = s.replace("()","");
            }else if (s.contains("{}")){
                s = s.replace("{}","");
            }else if(s.contains("[]")){
                s = s.replace("[]","");
            }else {
                break;
            }
        }
        return s.isEmpty();
    }
}