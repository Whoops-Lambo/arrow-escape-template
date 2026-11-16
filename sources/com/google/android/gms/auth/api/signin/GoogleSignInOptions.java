package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.zm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions k;
    public static final Scope l;
    public static final Scope m;
    public static final Scope n;
    public static final zm o;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static final class Builder {
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public String i;
        public HashSet a = new HashSet();
        public HashMap h = new HashMap();

        public final GoogleSignInOptions a() {
            HashSet hashSet = this.a;
            if (hashSet.contains(GoogleSignInOptions.n)) {
                Scope scope = GoogleSignInOptions.m;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            if (this.d && (this.f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.l);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }
    }

    static {
        Scope scope = new Scope(Scopes.PROFILE);
        new Scope("email");
        Scope scope2 = new Scope(Scopes.OPEN_ID);
        l = scope2;
        Scope scope3 = new Scope(Scopes.GAMES_LITE);
        m = scope3;
        n = new Scope(Scopes.GAMES);
        Builder builder = new Builder();
        builder.a.add(scope2);
        builder.a.add(scope);
        k = builder.a();
        Builder builder2 = new Builder();
        HashSet hashSet = builder2.a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        builder2.a();
        CREATOR = new zad();
        o = new zm(18);
    }

    public static HashMap r0(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) obj;
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.b;
            String str2 = googleSignInOptions.g;
            if (this.i.isEmpty() && googleSignInOptions.i.isEmpty()) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.c;
                    Account account2 = googleSignInOptions.c;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f == googleSignInOptions.f && this.d == googleSignInOptions.d && this.e == googleSignInOptions.e && TextUtils.equals(this.j, googleSignInOptions.j);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.c);
        hashAccumulator.a(this.g);
        hashAccumulator.a = (((((hashAccumulator.a * 31) + (this.f ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
        hashAccumulator.a(this.j);
        return hashAccumulator.a;
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList(map.values());
        this.j = str3;
    }

    public static GoogleSignInOptions d(String str) {
        String strOptString;
        Account account;
        String strOptString2;
        String strOptString3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            strOptString = jSONObject.optString("accountName");
        } else {
            strOptString = null;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            account = new Account(strOptString, AccountType.GOOGLE);
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            strOptString2 = jSONObject.optString("serverClientId");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            strOptString3 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, strOptString2, strOptString3, new HashMap(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel, 2, new ArrayList(this.b), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.writeString(parcel, 8, this.h, false);
        SafeParcelWriter.writeTypedList(parcel, 9, this.i, false);
        SafeParcelWriter.writeString(parcel, 10, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
