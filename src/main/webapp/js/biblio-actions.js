
 class BiblioAction {
    constructor(){
       this.elements();
       this.ajax = new Ajax();
    }
    searchAuthorsByName(){
        let params = {
            name : this.name.value
        }
     this.ajax.get('biblio/search-autho',params,(response) =>{
           let authors = JSON.parse(response.text);
           let s = '<ol>';
           for(let a of authors){
              s+= '<li>' + a.name +'</li>';
              
           }
           s+= '</ol>';
           this.result.innerHTML = s;
      })
    }
    elements(){
        this.name = document.getElementById("name");
        this.result = document.getElementById("result");
    }
}