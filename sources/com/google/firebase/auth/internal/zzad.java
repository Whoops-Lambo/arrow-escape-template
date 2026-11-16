package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.zzc;
import defpackage.bq3;
import defpackage.gy3;
import defpackage.s42;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
public final class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new s42(21);
    public zzaia a;
    public zzz b;
    public String c;
    public String d;
    public ArrayList e;
    public ArrayList f;
    public String g;
    public Boolean h;
    public zzaf i;
    public boolean j;
    public zzc k;
    public zzbl l;
    public List m;

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized FirebaseUser zza(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.e = new ArrayList(list.size());
            this.f = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                UserInfo userInfo = (UserInfo) list.get(i);
                if (userInfo.getProviderId().equals("firebase")) {
                    this.b = (zzz) userInfo;
                } else {
                    this.f.add(userInfo.getProviderId());
                }
                this.e.add((zzz) userInfo);
            }
            if (this.b == null) {
                this.b = (zzz) this.e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final String getDisplayName() {
        return this.b.c;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final String getEmail() {
        return this.b.f;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseUserMetadata getMetadata() {
        return this.i;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ MultiFactor getMultiFactor() {
        return new bq3(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final String getPhoneNumber() {
        return this.b.g;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final Uri getPhotoUrl() {
        return this.b.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List getProviderData() {
        return this.e;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final String getProviderId() {
        return this.b.b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String getTenantId() {
        String str;
        Map map;
        zzaia zzaiaVar = this.a;
        if (zzaiaVar == null || (str = zzaiaVar.b) == null || (map = (Map) gy3.a(str).getClaims().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public final String getUid() {
        return this.b.a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean isAnonymous() {
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue()) {
            zzaia zzaiaVar = this.a;
            String signInProvider = zzaiaVar != null ? gy3.a(zzaiaVar.b).getSignInProvider() : "";
            boolean z = true;
            if (this.e.size() > 1 || (signInProvider != null && signInProvider.equals("custom"))) {
                z = false;
            }
            this.h = Boolean.valueOf(z);
        }
        return this.h.booleanValue();
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.b.h;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzb(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.m = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzc(List list) {
        zzbl zzblVar;
        if (list == null || list.isEmpty()) {
            zzblVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList2.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzblVar = new zzbl(arrayList, arrayList2);
        }
        this.l = zzblVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return this.a.b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.a.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzf() {
        return this.m;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.f;
    }

    public zzad(FirebaseApp firebaseApp, List list) {
        Preconditions.checkNotNull(firebaseApp);
        this.c = firebaseApp.getName();
        this.d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.g = "2";
        zza(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(isAnonymous()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.i, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.j);
        SafeParcelWriter.writeParcelable(parcel, 11, this.k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.l, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.m, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser zzb() {
        this.h = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzaia zzc() {
        return this.a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseApp zza() {
        return FirebaseApp.getInstance(this.c);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zza(zzaia zzaiaVar) {
        this.a = (zzaia) Preconditions.checkNotNull(zzaiaVar);
    }
}
