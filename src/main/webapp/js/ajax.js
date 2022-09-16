/**
 * 
 */
 
 class Ajax {
    constructor(){
        this.xhr = new XMLHttpRequest();
        
    }
    get(url,params,callback){
        let s = "";;
        let sep = "?";
        for(let p in params){
          s+=sep+p+"="+params[p];
          sep = '&';
        }
        this.xhr.open('GET',url+s,true);
        this.xhr.onreadystatechange =  function(){
            if(this.xhr.readyState == XMLHttpRequest.DONE){
                if(this.xhr.status== 200){
                    callback({text : this.xhr.responseText,xml: this.xhr.responseXML});
                }
           
           }
        }.bind(this) ;
        this.xhr.send();
    }
    post(){

    }
}