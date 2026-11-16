package defpackage;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class uf extends PersistedInstallationEntry {
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ h50.C(this.c)) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long b() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String d() {
        return this.h;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str = this.b;
        if (str == null) {
            if (persistedInstallationEntry.c() != null) {
                return false;
            }
        } else if (!str.equals(persistedInstallationEntry.c())) {
            return false;
        }
        if (!h50.b(this.c, persistedInstallationEntry.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (persistedInstallationEntry.a() != null) {
                return false;
            }
        } else if (!str2.equals(persistedInstallationEntry.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (persistedInstallationEntry.e() != null) {
                return false;
            }
        } else if (!str3.equals(persistedInstallationEntry.e())) {
            return false;
        }
        if (this.f != persistedInstallationEntry.b() || this.g != persistedInstallationEntry.g()) {
            return false;
        }
        String str4 = this.h;
        if (str4 == null) {
            return persistedInstallationEntry.d() == null;
        }
        return str4.equals(persistedInstallationEntry.d());
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final int f() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long g() {
        return this.g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final tf i() {
        tf tfVar = new tf();
        tfVar.a = this.b;
        tfVar.b = this.c;
        tfVar.c = this.d;
        tfVar.d = this.e;
        tfVar.e = this.f;
        tfVar.f = this.g;
        tfVar.g = this.h;
        tfVar.h = (byte) 3;
        return tfVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        int i = this.c;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return nj.q(sb, this.h, "}");
    }

    public uf(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
