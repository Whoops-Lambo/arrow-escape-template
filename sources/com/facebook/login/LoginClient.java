package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.ecffri.arrows.R;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.v0;
import defpackage.lz;
import defpackage.n30;
import defpackage.s71;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "com/facebook/ads/a", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public class LoginClient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new a(5);
    public LoginMethodHandler[] a;
    public int b;
    public r c;
    public q d;
    public com.facebook.ads.a e;
    public boolean f;
    public Request g;
    public Map h;
    public LinkedHashMap i;
    public s j;
    public int k;
    public int l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new n();
        public final int a;
        public Set b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public boolean h;
        public final String i;
        public final String j;
        public final String k;
        public String l;
        public boolean m;
        public final int n;
        public boolean o;
        public boolean p;
        public final boolean q;
        public final String r;
        public final String s;
        public final String t;
        public final String u;
        public final int v;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0077 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x0079  */
        /* JADX WARN: Code duplicated, block: B:31:0x0082  */
        /* JADX WARN: Code duplicated, block: B:33:0x008a  */
        /* JADX WARN: Code duplicated, block: B:34:0x008c  */
        /* JADX WARN: Code duplicated, block: B:36:0x0094  */
        /* JADX WARN: Code duplicated, block: B:37:0x0096  */
        /* JADX WARN: Code duplicated, block: B:40:0x009f  */
        /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:47:0x00db  */
        /* JADX WARN: Code duplicated, block: B:50:0x0101  */
        /* JADX WARN: Code duplicated, block: B:51:0x0103  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:55:0x010e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0117  */
        /* JADX WARN: Code duplicated, block: B:60:0x011f  */
        /* JADX WARN: Code duplicated, block: B:61:0x0121  */
        /* JADX WARN: Code duplicated, block: B:63:0x012c  */
        /* JADX WARN: Code duplicated, block: B:64:0x0130  */
        /* JADX WARN: Code duplicated, block: B:67:0x0139  */
        /* JADX WARN: Code duplicated, block: B:68:0x013b  */
        /* JADX WARN: Code duplicated, block: B:71:0x0144  */
        /* JADX WARN: Code duplicated, block: B:72:0x0146  */
        /* JADX WARN: Code duplicated, block: B:75:0x014f  */
        /* JADX WARN: Code duplicated, block: B:76:0x0151  */
        /* JADX WARN: Code duplicated, block: B:79:0x0177 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x0179  */
        /* JADX WARN: Code duplicated, block: B:82:0x0181  */
        /* JADX WARN: Code duplicated, block: B:83:0x0183  */
        /* JADX WARN: Code duplicated, block: B:86:0x018c  */
        /* JADX WARN: Code duplicated, block: B:88:0x0197  */
        public Request(Parcel parcel) {
            int i;
            String string;
            boolean z;
            boolean z2;
            String string2;
            int i2;
            boolean z3;
            boolean z4;
            boolean z5;
            String string3;
            String string4 = parcel.readString();
            v0.O(string4, "loginBehavior");
            int i3 = 4;
            int i4 = 2;
            int i5 = 0;
            if (string4 != null) {
                if (string4.equals("NATIVE_WITH_FALLBACK")) {
                    i = 1;
                } else if (string4.equals("NATIVE_ONLY")) {
                    i = 2;
                } else if (string4.equals("KATANA_ONLY")) {
                    i = 3;
                } else if (string4.equals("WEB_ONLY")) {
                    i = 4;
                } else if (string4.equals("DIALOG_ONLY")) {
                    i = 5;
                } else if (string4.equals("DEVICE_AUTH")) {
                    i = 6;
                } else {
                    defpackage.d.r("No enum constant com.facebook.login.LoginBehavior.".concat(string4));
                }
                this.a = i;
                ArrayList arrayList = new ArrayList();
                parcel.readStringList(arrayList);
                this.b = new HashSet(arrayList);
                string = parcel.readString();
                if (string == null) {
                    if (string != null) {
                        if (string.equals("NONE")) {
                            if (string.equals("ONLY_ME")) {
                                i3 = 2;
                            } else if (string.equals("FRIENDS")) {
                                i3 = 3;
                            } else if (!string.equals("EVERYONE")) {
                                defpackage.d.r("No enum constant com.facebook.login.DefaultAudience.".concat(string));
                            }
                        } else {
                            i3 = 1;
                        }
                    } else {
                        defpackage.d.w("Name is null");
                    }
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                this.c = i3;
                String string5 = parcel.readString();
                v0.O(string5, "applicationId");
                this.d = string5;
                this.e = parcel.readString();
                this.f = parcel.readString();
                String string6 = parcel.readString();
                v0.O(string6, "authId");
                this.g = string6;
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z;
                this.i = parcel.readString();
                String string7 = parcel.readString();
                v0.O(string7, "authType");
                this.j = string7;
                this.k = parcel.readString();
                this.l = parcel.readString();
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.m = z2;
                string2 = parcel.readString();
                if (string2 == null) {
                    if (string2 != null) {
                        if (string2.equals("FACEBOOK")) {
                            if (string2.equals("INSTAGRAM")) {
                                i2 = 2;
                            } else {
                                defpackage.d.r("No enum constant com.facebook.login.LoginTargetApp.".concat(string2));
                            }
                        } else {
                            i2 = 1;
                        }
                    } else {
                        defpackage.d.w("Name is null");
                    }
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.n = i2;
                if (parcel.readByte() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.o = z3;
                if (parcel.readByte() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.p = z4;
                if (parcel.readByte() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.q = z5;
                this.r = parcel.readString();
                String string8 = parcel.readString();
                v0.O(string8, "nonce");
                this.s = string8;
                this.t = parcel.readString();
                this.u = parcel.readString();
                string3 = parcel.readString();
                if (string3 != null) {
                    if (string3 != null) {
                        if (string3.equals("S256")) {
                            i4 = 1;
                        } else if (!string3.equals("PLAIN")) {
                            defpackage.d.r("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string3));
                        }
                        i5 = i4;
                    } else {
                        defpackage.d.w("Name is null");
                    }
                    i4 = 0;
                    i5 = i4;
                }
                this.v = i5;
            }
            defpackage.d.w("Name is null");
            i = 0;
            this.a = i;
            ArrayList arrayList2 = new ArrayList();
            parcel.readStringList(arrayList2);
            this.b = new HashSet(arrayList2);
            string = parcel.readString();
            if (string == null) {
                if (string != null) {
                    if (string.equals("NONE")) {
                        if (string.equals("ONLY_ME")) {
                            i3 = 2;
                        } else if (string.equals("FRIENDS")) {
                            i3 = 3;
                        } else if (!string.equals("EVERYONE")) {
                            defpackage.d.r("No enum constant com.facebook.login.DefaultAudience.".concat(string));
                        }
                    } else {
                        i3 = 1;
                    }
                } else {
                    defpackage.d.w("Name is null");
                }
                i3 = 0;
            } else {
                i3 = 1;
            }
            this.c = i3;
            String string9 = parcel.readString();
            v0.O(string9, "applicationId");
            this.d = string9;
            this.e = parcel.readString();
            this.f = parcel.readString();
            String string10 = parcel.readString();
            v0.O(string10, "authId");
            this.g = string10;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
            this.i = parcel.readString();
            String string11 = parcel.readString();
            v0.O(string11, "authType");
            this.j = string11;
            this.k = parcel.readString();
            this.l = parcel.readString();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.m = z2;
            string2 = parcel.readString();
            if (string2 == null) {
                if (string2 != null) {
                    if (string2.equals("FACEBOOK")) {
                        if (string2.equals("INSTAGRAM")) {
                            i2 = 2;
                        } else {
                            defpackage.d.r("No enum constant com.facebook.login.LoginTargetApp.".concat(string2));
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    defpackage.d.w("Name is null");
                }
                i2 = 0;
            } else {
                i2 = 1;
            }
            this.n = i2;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.o = z3;
            if (parcel.readByte() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.p = z4;
            if (parcel.readByte() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.q = z5;
            this.r = parcel.readString();
            String string12 = parcel.readString();
            v0.O(string12, "nonce");
            this.s = string12;
            this.t = parcel.readString();
            this.u = parcel.readString();
            string3 = parcel.readString();
            if (string3 != null) {
                if (string3 != null) {
                    if (string3.equals("S256")) {
                        i4 = 1;
                    } else if (!string3.equals("PLAIN")) {
                        defpackage.d.r("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string3));
                    }
                    i5 = i4;
                } else {
                    defpackage.d.w("Name is null");
                }
                i4 = 0;
                i5 = i4;
            }
            this.v = i5;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.getClass();
            parcel.writeString(com.explorestack.protobuf.z.u(this.a));
            parcel.writeStringList(new ArrayList(this.b));
            parcel.writeString(com.explorestack.protobuf.z.t(this.c));
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            String strS = null;
            int i2 = this.n;
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "INSTAGRAM";
                } else {
                    throw null;
                }
            } else {
                str = "FACEBOOK";
            }
            parcel.writeString(str);
            parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeString(this.u);
            int i3 = this.v;
            if (i3 != 0) {
                strS = com.explorestack.protobuf.z.s(i3);
            }
            parcel.writeString(strS);
        }

        public Request(Set set, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
            this.a = 1;
            this.b = set;
            this.c = 3;
            this.j = "rerequest";
            this.d = str;
            this.e = str6;
            this.f = str7;
            this.g = str2;
            this.n = 1;
            if (str3 != null && str3.length() != 0) {
                this.s = str3;
            } else {
                this.s = n30.f();
            }
            this.t = str4;
            this.u = str5;
            this.v = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new o();
        public final int a;
        public final AccessToken b;
        public final AuthenticationToken c;
        public final String d;
        public final String e;
        public final Request f;
        public Map g;
        public HashMap h;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            string = string == null ? "error" : string;
            int i = 0;
            if (string != null) {
                if (string.equals("SUCCESS")) {
                    i = 1;
                } else if (string.equals("CANCEL")) {
                    i = 2;
                } else if (string.equals("ERROR")) {
                    i = 3;
                } else {
                    defpackage.d.r("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(string));
                }
            } else {
                defpackage.d.w("Name is null");
            }
            this.a = i;
            this.b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.g = v0.S(parcel);
            this.h = v0.S(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.getClass();
            int i2 = this.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "ERROR";
                    } else {
                        throw null;
                    }
                } else {
                    str = "CANCEL";
                }
            } else {
                str = "SUCCESS";
            }
            parcel.writeString(str);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            v0.Y(parcel, this.g);
            v0.Y(parcel, this.h);
        }

        public Result(Request request, int i, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            if (i != 0) {
                this.f = request;
                this.b = accessToken;
                this.c = authenticationToken;
                this.d = str;
                this.a = i;
                this.e = str2;
                return;
            }
            throw null;
        }
    }

    public final void a(String str, String str2, boolean z) {
        Map map = this.h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.h == null) {
            this.h = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f) {
            return true;
        }
        FragmentActivity fragmentActivityE = e();
        if ((fragmentActivityE != null ? fragmentActivityE.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f = true;
            return true;
        }
        FragmentActivity fragmentActivityE2 = e();
        String string = fragmentActivityE2 != null ? fragmentActivityE2.getString(R.string.com_facebook_internet_permission_error_title) : null;
        String string2 = fragmentActivityE2 != null ? fragmentActivityE2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        Request request = this.g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:8:0x001c, B:10:0x0026, B:14:0x0054, B:13:0x003b), top: B:23:0x001c }] */
    public final void d(Result result) {
        Result result2;
        result.getClass();
        AccessToken accessToken = result.b;
        if (accessToken != null) {
            Date date = AccessToken.l;
            if (com.facebook.appevents.h.r()) {
                AccessToken accessTokenP = com.facebook.appevents.h.p();
                if (accessTokenP != null) {
                    try {
                        if (s71.b(accessTokenP.i, accessToken.i)) {
                            result2 = new Result(this.g, 1, result.b, result.c, null, null);
                        } else {
                            Request request = this.g;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            result2 = new Result(request, 3, null, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e) {
                        Request request2 = this.g;
                        String message = e.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        c(new Result(request2, 3, null, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    Request request3 = this.g;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    result2 = new Result(request3, 3, null, null, TextUtils.join(": ", arrayList3), null);
                }
                c(result2);
                return;
            }
        }
        c(result);
    }

    public final FragmentActivity e() {
        r rVar = this.c;
        if (rVar != null) {
            return rVar.getActivity();
        }
        return null;
    }

    public final LoginMethodHandler f() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.b;
        if (i < 0 || (loginMethodHandlerArr = this.a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    public final s g() {
        Context contextE;
        Request request;
        String strB;
        String str;
        s sVar = this.j;
        if (sVar != null) {
            if (lz.a.contains(sVar)) {
                str = null;
            } else {
                try {
                    str = sVar.a;
                } catch (Throwable th) {
                    lz.a(sVar, th);
                    str = null;
                }
            }
            Request request2 = this.g;
            if (!s71.b(str, request2 != null ? request2.d : null)) {
                contextE = e();
                if (contextE == null) {
                    contextE = com.facebook.a0.a();
                }
                request = this.g;
                if (request != null || (strB = request.d) == null) {
                    strB = com.facebook.a0.b();
                }
                sVar = new s(contextE, strB);
                this.j = sVar;
            }
        } else {
            contextE = e();
            if (contextE == null) {
                contextE = com.facebook.a0.a();
            }
            request = this.g;
            if (request != null) {
                strB = com.facebook.a0.b();
            } else {
                strB = com.facebook.a0.b();
            }
            sVar = new s(contextE, strB);
            this.j = sVar;
        }
        return sVar;
    }

    public final void h(String str, String str2, String str3, String str4, Map map) {
        Request request = this.g;
        if (request == null) {
            g().c("fb_mobile_login_method_complete", str);
            return;
        }
        s sVarG = g();
        String str5 = request.g;
        String str6 = request.o ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (lz.a.contains(sVarG)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = s.d;
            Bundle bundleB = w.b(str5);
            bundleB.putString("2_result", str2);
            if (str3 != null) {
                bundleB.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleB.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleB.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleB.putString("3_method", str);
            sVarG.a(bundleB, str6);
        } catch (Throwable th) {
            lz.a(sVarG, th);
        }
    }

    public final void i(int i, int i2, Intent intent) {
        this.k++;
        if (this.g != null) {
            if (intent != null) {
                int i3 = CustomTabMainActivity.c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    j();
                    return;
                }
            }
            LoginMethodHandler loginMethodHandlerF = f();
            if (loginMethodHandlerF != null) {
                if ((loginMethodHandlerF instanceof KatanaProxyLoginMethodHandler) && intent == null && this.k < this.l) {
                    return;
                }
                loginMethodHandlerF.h(i, i2, intent);
            }
        }
    }

    public final void c(Result result) {
        LoginClient loginClient;
        result.getClass();
        int i = result.a;
        LoginMethodHandler loginMethodHandlerF = f();
        if (loginMethodHandlerF != null) {
            loginClient = this;
            loginClient.h(loginMethodHandlerF.getF(), com.explorestack.protobuf.z.f(i), result.d, result.e, loginMethodHandlerF.a);
        } else {
            loginClient = this;
        }
        Map map = loginClient.h;
        if (map != null) {
            result.g = map;
        }
        LinkedHashMap linkedHashMap = loginClient.i;
        if (linkedHashMap != null) {
            result.h = linkedHashMap;
        }
        loginClient.a = null;
        int i2 = -1;
        loginClient.b = -1;
        loginClient.g = null;
        loginClient.h = null;
        loginClient.k = 0;
        loginClient.l = 0;
        q qVar = loginClient.d;
        if (qVar != null) {
            r rVar = (r) qVar.a;
            rVar.b = null;
            if (i == 2) {
                i2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = rVar.getActivity();
            if (rVar.isAdded() && activity != null) {
                activity.setResult(i2, intent);
                activity.finish();
            }
        }
    }

    public final void j() {
        LoginClient loginClient;
        String str;
        String str2;
        LoginMethodHandler loginMethodHandlerF = f();
        if (loginMethodHandlerF != null) {
            loginClient = this;
            loginClient.h(loginMethodHandlerF.getF(), "skipped", null, null, loginMethodHandlerF.a);
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.a;
        while (loginMethodHandlerArr != null) {
            int i = loginClient.b;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.b = i + 1;
            LoginMethodHandler loginMethodHandlerF2 = loginClient.f();
            if (loginMethodHandlerF2 != null) {
                if ((loginMethodHandlerF2 instanceof WebViewLoginMethodHandler) && !loginClient.b()) {
                    loginClient.a("no_internet_permission", "1", false);
                } else {
                    Request request = loginClient.g;
                    if (request == null) {
                        continue;
                    } else {
                        String str3 = request.g;
                        int iL = loginMethodHandlerF2.l(request);
                        loginClient.k = 0;
                        if (iL > 0) {
                            s sVarG = loginClient.g();
                            String strE = loginMethodHandlerF2.getF();
                            if (request.o) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!lz.a.contains(sVarG)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = s.d;
                                    Bundle bundleB = w.b(str3);
                                    bundleB.putString("3_method", strE);
                                    sVarG.a(bundleB, str2);
                                } catch (Throwable th) {
                                    lz.a(sVarG, th);
                                }
                            }
                            loginClient.l = iL;
                        } else {
                            s sVarG2 = loginClient.g();
                            String strE2 = loginMethodHandlerF2.getF();
                            if (request.o) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!lz.a.contains(sVarG2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = s.d;
                                    Bundle bundleB2 = w.b(str3);
                                    bundleB2.putString("3_method", strE2);
                                    sVarG2.a(bundleB2, str);
                                } catch (Throwable th2) {
                                    lz.a(sVarG2, th2);
                                }
                            }
                            loginClient.a("not_tried", loginMethodHandlerF2.getF(), true);
                        }
                        if (iL > 0) {
                            return;
                        }
                    }
                }
            }
        }
        Request request2 = loginClient.g;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            loginClient.c(new Result(request2, 3, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        v0.Y(parcel, this.h);
        v0.Y(parcel, this.i);
    }
}
