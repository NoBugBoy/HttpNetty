package server.database.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Fuser {
    private Integer fid;

    private String floginname;

    private String floginpassword;

    private String ftradepassword;

    private String fnickname;

    private String frealname;

    private String ftelephone;

    private String femail;

    private String fidentityno;

    private Date fregistertime;

    private Date flastlogintime;

    private String fgoogleauthenticator;

    private String fgoogleurl;

    private String fmobilmessagecode;

    private Integer fstatus;

    private Boolean fistelvalidate;

    private Boolean fismailvalidate;

    private Boolean fgooglevalidate;

    private Boolean fopentelvalidate;

    private Boolean fopengooglevalidate;

    private Boolean fopensecondvalidate;

    private Boolean fgooglebind;

    private Boolean fpostrealvalidate;

    private Boolean fhasrealvalidate;

    private Date fpostrealvalidatetime;

    private Date fhasrealvalidatetime;

    private Integer fidentitytype;

    private Boolean fistelephonebind;

    private Date flastupdatetime;

    private String fareacode;

    private Integer fscoreid;

    private Integer version;

    private String fidentitypath;

    private Integer fapi;

    private String fidentitypath2;

    private Integer finvalidateintrocount;

    private Date flastupdatezhongdoutime;

    private Boolean fisstartzhongdou;

    private String qqlogin;

    private String faddress;

    private Integer fregtype;

    private Integer fgrade;

    private String fuserno;

    private BigDecimal fbalancecny;

    private BigDecimal fbalancetmc;

    private String fuserintrolno;

    private Byte fisvalid;

    private Byte fistiger;

    private String fregip;

    private String flastloginip;

    private String fintroluserno;

    private String salt;

    private String fidentitypath3;

    private Integer fusertype;

    private String fservicetraderate;

    private String fservicesubrate;

    private String fproxynumber;

    private BigDecimal fproxytraderate;

    private BigDecimal fproxysubrate;

    private Byte fischeck;

    private String fsex;

    private String country;

    private Date fbirth;

    private Byte fposthighvalidate;

    private Byte fhashighvalidate;

    private Date fposthighvalidatetime;

    private Date fhashighvalidatetime;

    private BigDecimal famt;

    private Integer fintrouserId3;

    private Integer fintrouserId2;

    private Byte fpostimgvalidate;

    private Byte fhasimgvalidate;

    private Date fpostimgvalidatetime;

    private Date fhasimgvalidatetime;

    private Byte fhasvideovalidate;

    private Date fhasvideovalidatetime;

    private Boolean fgooglecheck;

    private Boolean fismerchant;

    private String fbankpath;

    private String fbankpath2;

    private String fbankpath3;

    private Integer authgrade;

    private Byte fhasbankvalidate;

    private Byte fpostbankvalidate;

    private Integer faudit;

    private Integer fleaderid;

    private Boolean fisversion;

    private Boolean fisleader;

    private Boolean fcanloginteammanager;

    private String folduid;

    private Integer fintrouserId;

    private String fcoaleaderid;

    private Integer finsertdata;

    private Integer finsertpwd;

    private Byte fisadvertise;

    private Integer layer;

    private Integer level;

    private Integer frewardedinviter;

    private Boolean fisearlywarning;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFloginname() {
        return floginname;
    }

    public void setFloginname(String floginname) {
        this.floginname = floginname == null ? null : floginname.trim();
    }

    public String getFloginpassword() {
        return floginpassword;
    }

    public void setFloginpassword(String floginpassword) {
        this.floginpassword = floginpassword == null ? null : floginpassword.trim();
    }

    public String getFtradepassword() {
        return ftradepassword;
    }

    public void setFtradepassword(String ftradepassword) {
        this.ftradepassword = ftradepassword == null ? null : ftradepassword.trim();
    }

    public String getFnickname() {
        return fnickname;
    }

    public void setFnickname(String fnickname) {
        this.fnickname = fnickname == null ? null : fnickname.trim();
    }

    public String getFrealname() {
        return frealname;
    }

    public void setFrealname(String frealname) {
        this.frealname = frealname == null ? null : frealname.trim();
    }

    public String getFtelephone() {
        return ftelephone;
    }

    public void setFtelephone(String ftelephone) {
        this.ftelephone = ftelephone == null ? null : ftelephone.trim();
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail == null ? null : femail.trim();
    }

    public String getFidentityno() {
        return fidentityno;
    }

    public void setFidentityno(String fidentityno) {
        this.fidentityno = fidentityno == null ? null : fidentityno.trim();
    }

    public Date getFregistertime() {
        return fregistertime;
    }

    public void setFregistertime(Date fregistertime) {
        this.fregistertime = fregistertime;
    }

    public Date getFlastlogintime() {
        return flastlogintime;
    }

    public void setFlastlogintime(Date flastlogintime) {
        this.flastlogintime = flastlogintime;
    }

    public String getFgoogleauthenticator() {
        return fgoogleauthenticator;
    }

    public void setFgoogleauthenticator(String fgoogleauthenticator) {
        this.fgoogleauthenticator = fgoogleauthenticator == null ? null : fgoogleauthenticator.trim();
    }

    public String getFgoogleurl() {
        return fgoogleurl;
    }

    public void setFgoogleurl(String fgoogleurl) {
        this.fgoogleurl = fgoogleurl == null ? null : fgoogleurl.trim();
    }

    public String getFmobilmessagecode() {
        return fmobilmessagecode;
    }

    public void setFmobilmessagecode(String fmobilmessagecode) {
        this.fmobilmessagecode = fmobilmessagecode == null ? null : fmobilmessagecode.trim();
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }

    public Boolean getFistelvalidate() {
        return fistelvalidate;
    }

    public void setFistelvalidate(Boolean fistelvalidate) {
        this.fistelvalidate = fistelvalidate;
    }

    public Boolean getFismailvalidate() {
        return fismailvalidate;
    }

    public void setFismailvalidate(Boolean fismailvalidate) {
        this.fismailvalidate = fismailvalidate;
    }

    public Boolean getFgooglevalidate() {
        return fgooglevalidate;
    }

    public void setFgooglevalidate(Boolean fgooglevalidate) {
        this.fgooglevalidate = fgooglevalidate;
    }

    public Boolean getFopentelvalidate() {
        return fopentelvalidate;
    }

    public void setFopentelvalidate(Boolean fopentelvalidate) {
        this.fopentelvalidate = fopentelvalidate;
    }

    public Boolean getFopengooglevalidate() {
        return fopengooglevalidate;
    }

    public void setFopengooglevalidate(Boolean fopengooglevalidate) {
        this.fopengooglevalidate = fopengooglevalidate;
    }

    public Boolean getFopensecondvalidate() {
        return fopensecondvalidate;
    }

    public void setFopensecondvalidate(Boolean fopensecondvalidate) {
        this.fopensecondvalidate = fopensecondvalidate;
    }

    public Boolean getFgooglebind() {
        return fgooglebind;
    }

    public void setFgooglebind(Boolean fgooglebind) {
        this.fgooglebind = fgooglebind;
    }

    public Boolean getFpostrealvalidate() {
        return fpostrealvalidate;
    }

    public void setFpostrealvalidate(Boolean fpostrealvalidate) {
        this.fpostrealvalidate = fpostrealvalidate;
    }

    public Boolean getFhasrealvalidate() {
        return fhasrealvalidate;
    }

    public void setFhasrealvalidate(Boolean fhasrealvalidate) {
        this.fhasrealvalidate = fhasrealvalidate;
    }

    public Date getFpostrealvalidatetime() {
        return fpostrealvalidatetime;
    }

    public void setFpostrealvalidatetime(Date fpostrealvalidatetime) {
        this.fpostrealvalidatetime = fpostrealvalidatetime;
    }

    public Date getFhasrealvalidatetime() {
        return fhasrealvalidatetime;
    }

    public void setFhasrealvalidatetime(Date fhasrealvalidatetime) {
        this.fhasrealvalidatetime = fhasrealvalidatetime;
    }

    public Integer getFidentitytype() {
        return fidentitytype;
    }

    public void setFidentitytype(Integer fidentitytype) {
        this.fidentitytype = fidentitytype;
    }

    public Boolean getFistelephonebind() {
        return fistelephonebind;
    }

    public void setFistelephonebind(Boolean fistelephonebind) {
        this.fistelephonebind = fistelephonebind;
    }

    public Date getFlastupdatetime() {
        return flastupdatetime;
    }

    public void setFlastupdatetime(Date flastupdatetime) {
        this.flastupdatetime = flastupdatetime;
    }

    public String getFareacode() {
        return fareacode;
    }

    public void setFareacode(String fareacode) {
        this.fareacode = fareacode == null ? null : fareacode.trim();
    }

    public Integer getFscoreid() {
        return fscoreid;
    }

    public void setFscoreid(Integer fscoreid) {
        this.fscoreid = fscoreid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFidentitypath() {
        return fidentitypath;
    }

    public void setFidentitypath(String fidentitypath) {
        this.fidentitypath = fidentitypath == null ? null : fidentitypath.trim();
    }

    public Integer getFapi() {
        return fapi;
    }

    public void setFapi(Integer fapi) {
        this.fapi = fapi;
    }

    public String getFidentitypath2() {
        return fidentitypath2;
    }

    public void setFidentitypath2(String fidentitypath2) {
        this.fidentitypath2 = fidentitypath2 == null ? null : fidentitypath2.trim();
    }

    public Integer getFinvalidateintrocount() {
        return finvalidateintrocount;
    }

    public void setFinvalidateintrocount(Integer finvalidateintrocount) {
        this.finvalidateintrocount = finvalidateintrocount;
    }

    public Date getFlastupdatezhongdoutime() {
        return flastupdatezhongdoutime;
    }

    public void setFlastupdatezhongdoutime(Date flastupdatezhongdoutime) {
        this.flastupdatezhongdoutime = flastupdatezhongdoutime;
    }

    public Boolean getFisstartzhongdou() {
        return fisstartzhongdou;
    }

    public void setFisstartzhongdou(Boolean fisstartzhongdou) {
        this.fisstartzhongdou = fisstartzhongdou;
    }

    public String getQqlogin() {
        return qqlogin;
    }

    public void setQqlogin(String qqlogin) {
        this.qqlogin = qqlogin == null ? null : qqlogin.trim();
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
    }

    public Integer getFregtype() {
        return fregtype;
    }

    public void setFregtype(Integer fregtype) {
        this.fregtype = fregtype;
    }

    public Integer getFgrade() {
        return fgrade;
    }

    public void setFgrade(Integer fgrade) {
        this.fgrade = fgrade;
    }

    public String getFuserno() {
        return fuserno;
    }

    public void setFuserno(String fuserno) {
        this.fuserno = fuserno == null ? null : fuserno.trim();
    }

    public BigDecimal getFbalancecny() {
        return fbalancecny;
    }

    public void setFbalancecny(BigDecimal fbalancecny) {
        this.fbalancecny = fbalancecny;
    }

    public BigDecimal getFbalancetmc() {
        return fbalancetmc;
    }

    public void setFbalancetmc(BigDecimal fbalancetmc) {
        this.fbalancetmc = fbalancetmc;
    }

    public String getFuserintrolno() {
        return fuserintrolno;
    }

    public void setFuserintrolno(String fuserintrolno) {
        this.fuserintrolno = fuserintrolno == null ? null : fuserintrolno.trim();
    }

    public Byte getFisvalid() {
        return fisvalid;
    }

    public void setFisvalid(Byte fisvalid) {
        this.fisvalid = fisvalid;
    }

    public Byte getFistiger() {
        return fistiger;
    }

    public void setFistiger(Byte fistiger) {
        this.fistiger = fistiger;
    }

    public String getFregip() {
        return fregip;
    }

    public void setFregip(String fregip) {
        this.fregip = fregip == null ? null : fregip.trim();
    }

    public String getFlastloginip() {
        return flastloginip;
    }

    public void setFlastloginip(String flastloginip) {
        this.flastloginip = flastloginip == null ? null : flastloginip.trim();
    }

    public String getFintroluserno() {
        return fintroluserno;
    }

    public void setFintroluserno(String fintroluserno) {
        this.fintroluserno = fintroluserno == null ? null : fintroluserno.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getFidentitypath3() {
        return fidentitypath3;
    }

    public void setFidentitypath3(String fidentitypath3) {
        this.fidentitypath3 = fidentitypath3 == null ? null : fidentitypath3.trim();
    }

    public Integer getFusertype() {
        return fusertype;
    }

    public void setFusertype(Integer fusertype) {
        this.fusertype = fusertype;
    }

    public String getFservicetraderate() {
        return fservicetraderate;
    }

    public void setFservicetraderate(String fservicetraderate) {
        this.fservicetraderate = fservicetraderate == null ? null : fservicetraderate.trim();
    }

    public String getFservicesubrate() {
        return fservicesubrate;
    }

    public void setFservicesubrate(String fservicesubrate) {
        this.fservicesubrate = fservicesubrate == null ? null : fservicesubrate.trim();
    }

    public String getFproxynumber() {
        return fproxynumber;
    }

    public void setFproxynumber(String fproxynumber) {
        this.fproxynumber = fproxynumber == null ? null : fproxynumber.trim();
    }

    public BigDecimal getFproxytraderate() {
        return fproxytraderate;
    }

    public void setFproxytraderate(BigDecimal fproxytraderate) {
        this.fproxytraderate = fproxytraderate;
    }

    public BigDecimal getFproxysubrate() {
        return fproxysubrate;
    }

    public void setFproxysubrate(BigDecimal fproxysubrate) {
        this.fproxysubrate = fproxysubrate;
    }

    public Byte getFischeck() {
        return fischeck;
    }

    public void setFischeck(Byte fischeck) {
        this.fischeck = fischeck;
    }

    public String getFsex() {
        return fsex;
    }

    public void setFsex(String fsex) {
        this.fsex = fsex == null ? null : fsex.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Date getFbirth() {
        return fbirth;
    }

    public void setFbirth(Date fbirth) {
        this.fbirth = fbirth;
    }

    public Byte getFposthighvalidate() {
        return fposthighvalidate;
    }

    public void setFposthighvalidate(Byte fposthighvalidate) {
        this.fposthighvalidate = fposthighvalidate;
    }

    public Byte getFhashighvalidate() {
        return fhashighvalidate;
    }

    public void setFhashighvalidate(Byte fhashighvalidate) {
        this.fhashighvalidate = fhashighvalidate;
    }

    public Date getFposthighvalidatetime() {
        return fposthighvalidatetime;
    }

    public void setFposthighvalidatetime(Date fposthighvalidatetime) {
        this.fposthighvalidatetime = fposthighvalidatetime;
    }

    public Date getFhashighvalidatetime() {
        return fhashighvalidatetime;
    }

    public void setFhashighvalidatetime(Date fhashighvalidatetime) {
        this.fhashighvalidatetime = fhashighvalidatetime;
    }

    public BigDecimal getFamt() {
        return famt;
    }

    public void setFamt(BigDecimal famt) {
        this.famt = famt;
    }

    public Integer getFintrouserId3() {
        return fintrouserId3;
    }

    public void setFintrouserId3(Integer fintrouserId3) {
        this.fintrouserId3 = fintrouserId3;
    }

    public Integer getFintrouserId2() {
        return fintrouserId2;
    }

    public void setFintrouserId2(Integer fintrouserId2) {
        this.fintrouserId2 = fintrouserId2;
    }

    public Byte getFpostimgvalidate() {
        return fpostimgvalidate;
    }

    public void setFpostimgvalidate(Byte fpostimgvalidate) {
        this.fpostimgvalidate = fpostimgvalidate;
    }

    public Byte getFhasimgvalidate() {
        return fhasimgvalidate;
    }

    public void setFhasimgvalidate(Byte fhasimgvalidate) {
        this.fhasimgvalidate = fhasimgvalidate;
    }

    public Date getFpostimgvalidatetime() {
        return fpostimgvalidatetime;
    }

    public void setFpostimgvalidatetime(Date fpostimgvalidatetime) {
        this.fpostimgvalidatetime = fpostimgvalidatetime;
    }

    public Date getFhasimgvalidatetime() {
        return fhasimgvalidatetime;
    }

    public void setFhasimgvalidatetime(Date fhasimgvalidatetime) {
        this.fhasimgvalidatetime = fhasimgvalidatetime;
    }

    public Byte getFhasvideovalidate() {
        return fhasvideovalidate;
    }

    public void setFhasvideovalidate(Byte fhasvideovalidate) {
        this.fhasvideovalidate = fhasvideovalidate;
    }

    public Date getFhasvideovalidatetime() {
        return fhasvideovalidatetime;
    }

    public void setFhasvideovalidatetime(Date fhasvideovalidatetime) {
        this.fhasvideovalidatetime = fhasvideovalidatetime;
    }

    public Boolean getFgooglecheck() {
        return fgooglecheck;
    }

    public void setFgooglecheck(Boolean fgooglecheck) {
        this.fgooglecheck = fgooglecheck;
    }

    public Boolean getFismerchant() {
        return fismerchant;
    }

    public void setFismerchant(Boolean fismerchant) {
        this.fismerchant = fismerchant;
    }

    public String getFbankpath() {
        return fbankpath;
    }

    public void setFbankpath(String fbankpath) {
        this.fbankpath = fbankpath == null ? null : fbankpath.trim();
    }

    public String getFbankpath2() {
        return fbankpath2;
    }

    public void setFbankpath2(String fbankpath2) {
        this.fbankpath2 = fbankpath2 == null ? null : fbankpath2.trim();
    }

    public String getFbankpath3() {
        return fbankpath3;
    }

    public void setFbankpath3(String fbankpath3) {
        this.fbankpath3 = fbankpath3 == null ? null : fbankpath3.trim();
    }

    public Integer getAuthgrade() {
        return authgrade;
    }

    public void setAuthgrade(Integer authgrade) {
        this.authgrade = authgrade;
    }

    public Byte getFhasbankvalidate() {
        return fhasbankvalidate;
    }

    public void setFhasbankvalidate(Byte fhasbankvalidate) {
        this.fhasbankvalidate = fhasbankvalidate;
    }

    public Byte getFpostbankvalidate() {
        return fpostbankvalidate;
    }

    public void setFpostbankvalidate(Byte fpostbankvalidate) {
        this.fpostbankvalidate = fpostbankvalidate;
    }

    public Integer getFaudit() {
        return faudit;
    }

    public void setFaudit(Integer faudit) {
        this.faudit = faudit;
    }

    public Integer getFleaderid() {
        return fleaderid;
    }

    public void setFleaderid(Integer fleaderid) {
        this.fleaderid = fleaderid;
    }

    public Boolean getFisversion() {
        return fisversion;
    }

    public void setFisversion(Boolean fisversion) {
        this.fisversion = fisversion;
    }

    public Boolean getFisleader() {
        return fisleader;
    }

    public void setFisleader(Boolean fisleader) {
        this.fisleader = fisleader;
    }

    public Boolean getFcanloginteammanager() {
        return fcanloginteammanager;
    }

    public void setFcanloginteammanager(Boolean fcanloginteammanager) {
        this.fcanloginteammanager = fcanloginteammanager;
    }

    public String getFolduid() {
        return folduid;
    }

    public void setFolduid(String folduid) {
        this.folduid = folduid == null ? null : folduid.trim();
    }

    public Integer getFintrouserId() {
        return fintrouserId;
    }

    public void setFintrouserId(Integer fintrouserId) {
        this.fintrouserId = fintrouserId;
    }

    public String getFcoaleaderid() {
        return fcoaleaderid;
    }

    public void setFcoaleaderid(String fcoaleaderid) {
        this.fcoaleaderid = fcoaleaderid == null ? null : fcoaleaderid.trim();
    }

    public Integer getFinsertdata() {
        return finsertdata;
    }

    public void setFinsertdata(Integer finsertdata) {
        this.finsertdata = finsertdata;
    }

    public Integer getFinsertpwd() {
        return finsertpwd;
    }

    public void setFinsertpwd(Integer finsertpwd) {
        this.finsertpwd = finsertpwd;
    }

    public Byte getFisadvertise() {
        return fisadvertise;
    }

    public void setFisadvertise(Byte fisadvertise) {
        this.fisadvertise = fisadvertise;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFrewardedinviter() {
        return frewardedinviter;
    }

    public void setFrewardedinviter(Integer frewardedinviter) {
        this.frewardedinviter = frewardedinviter;
    }

    public Boolean getFisearlywarning() {
        return fisearlywarning;
    }

    public void setFisearlywarning(Boolean fisearlywarning) {
        this.fisearlywarning = fisearlywarning;
    }
}