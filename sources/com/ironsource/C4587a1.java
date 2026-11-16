package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class C4587a1 implements Parcelable {
    public static final Parcelable.Creator<C4587a1> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private ArrayList<String> f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private ArrayList<String> i;
    private String j;
    private String k;
    private Map<String, String> l;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Parcelable.Creator<C4587a1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4587a1 createFromParcel(Parcel parcel) {
            return new C4587a1(0, parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4587a1[] newArray(int i) {
            return new C4587a1[i];
        }
    }

    private void i() {
        this.d = false;
        this.e = -1;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.k = "";
        this.j = "";
        this.l = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectJsonObjectInit.getString(next));
            }
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        } catch (Throwable th) {
            C4950r4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
        return map;
    }

    public String f() {
        return this.k;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public boolean j() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.l);
            sb.append(", ");
        } catch (Throwable th) {
            C4950r4.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new JSONObject(this.l).toString());
        } catch (Throwable th) {
            C4950r4.d().a(th);
        }
    }

    private C4587a1(Parcel parcel) {
        boolean z;
        i();
        try {
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            this.e = parcel.readInt();
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (Throwable th) {
            C4950r4.d().a(th);
            i();
        }
    }

    public void b(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<String> arrayList = this.i;
            if (z) {
                if (arrayList.indexOf(str) == -1) {
                    this.i.add(str);
                    return;
                }
                return;
            }
            arrayList.remove(str);
        }
    }

    public void c(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<String> arrayList = this.f;
            if (z) {
                if (arrayList.indexOf(str) == -1) {
                    this.f.add(str);
                    return;
                }
                return;
            }
            arrayList.remove(str);
        }
    }

    public void d(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<String> arrayList = this.h;
            if (z) {
                if (arrayList.indexOf(str) == -1) {
                    this.h.add(str);
                    return;
                }
                return;
            }
            arrayList.remove(str);
        }
    }

    public boolean e(String str) {
        if (!TextUtils.isEmpty(str) && this.h.indexOf(str) > -1) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.c = str;
    }

    public String g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    public void j(String str) {
        this.b = str;
    }

    public Map<String, String> e() {
        return this.l;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public String d() {
        return this.j;
    }

    public void i(String str) {
        this.a = str;
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a() {
        this.e = -1;
    }

    public C4587a1() {
        i();
    }

    public void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<String> arrayList = this.g;
        if (z) {
            if (arrayList.indexOf(str) == -1) {
                this.g.add(str);
                return;
            }
            return;
        }
        arrayList.remove(str);
    }

    public /* synthetic */ C4587a1(int i, Parcel parcel) {
        this(parcel);
    }
}
