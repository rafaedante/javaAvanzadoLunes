/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temascertificacion;

/**
 *
 * @author rafaeli
 */
public enum WhoisRIR {
    
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    JPNIC("whois.jpnic.net"),
    CNNIC("whois.cnnic.net"),
    UNKNOWN("");
    
    private String url;
    
    WhoisRIR(String url){
        this.url = url;
    }
    
    public String url() {
        return url;
    }
    
}
