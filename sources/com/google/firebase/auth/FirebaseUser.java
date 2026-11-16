package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import defpackage.ei3;
import defpackage.p85;
import defpackage.pw3;
import defpackage.w13;
import defpackage.wo3;
import defpackage.wx2;
import defpackage.ym3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements UserInfo {
    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getDisplayName();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getEmail();

    @Nullable
    public abstract FirebaseUserMetadata getMetadata();

    @NonNull
    public abstract MultiFactor getMultiFactor();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getPhoneNumber();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract Uri getPhotoUrl();

    @NonNull
    public abstract List<? extends UserInfo> getProviderData();

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public abstract String getProviderId();

    @Nullable
    public abstract String getTenantId();

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public abstract String getUid();

    public abstract boolean isAnonymous();

    @NonNull
    public abstract FirebaseApp zza();

    @NonNull
    public abstract FirebaseUser zza(@NonNull List<? extends UserInfo> list);

    public abstract void zza(@NonNull zzaia zzaiaVar);

    @NonNull
    public abstract FirebaseUser zzb();

    public abstract void zzb(@Nullable List<zzao> list);

    @NonNull
    public abstract zzaia zzc();

    public abstract void zzc(@NonNull List<MultiFactorInfo> list);

    @NonNull
    public abstract String zzd();

    @NonNull
    public abstract String zze();

    @NonNull
    public abstract List<zzao> zzf();

    @Nullable
    public abstract List<String> zzg();

    @NonNull
    public Task<Void> delete() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zza());
        Preconditions.checkNotNull(this);
        zzafx zzafxVar = firebaseAuth.zzd;
        pw3 p85Var = new p85(firebaseAuth, this);
        zzafxVar.getClass();
        wo3 ym3Var = new ym3(5, 0);
        ym3Var.e(this);
        ym3Var.f(p85Var);
        ym3Var.h(p85Var);
        return zzafxVar.a(ym3Var);
    }

    @NonNull
    public Task<GetTokenResult> getIdToken(boolean z) {
        return FirebaseAuth.getInstance(zza()).zza(this, z);
    }

    @NonNull
    public Task<AuthResult> linkWithCredential(@NonNull AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(zza()).zza(this, authCredential);
    }

    @NonNull
    public Task<Void> reauthenticate(@NonNull AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(zza()).zzb(this, authCredential);
    }

    @NonNull
    public Task<AuthResult> reauthenticateAndRetrieveData(@NonNull AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(zza()).zzc(this, authCredential);
    }

    @NonNull
    public Task<Void> reload() {
        return FirebaseAuth.getInstance(zza()).zza(this);
    }

    @NonNull
    public Task<Void> sendEmailVerification() {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new w13(this, 14));
    }

    @NonNull
    public Task<AuthResult> startActivityForLinkWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zza(activity, federatedAuthProvider, this);
    }

    @NonNull
    public Task<AuthResult> startActivityForReauthenticateWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zzb(activity, federatedAuthProvider, this);
    }

    @NonNull
    public Task<AuthResult> unlink(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(zza()).zzb(this, str);
    }

    @NonNull
    @Deprecated
    public Task<Void> updateEmail(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(zza()).zzc(this, str);
    }

    @NonNull
    public Task<Void> updatePassword(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(zza()).zzd(this, str);
    }

    @NonNull
    public Task<Void> updatePhoneNumber(@NonNull PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(zza()).zza(this, phoneAuthCredential);
    }

    @NonNull
    public Task<Void> updateProfile(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(userProfileChangeRequest);
        return FirebaseAuth.getInstance(zza()).zza(this, userProfileChangeRequest);
    }

    @NonNull
    public Task<Void> verifyBeforeUpdateEmail(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new wx2(this, str, actionCodeSettings, false, 10));
    }

    @NonNull
    public Task<Void> sendEmailVerification(@NonNull ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new ei3((Object) this, (Object) actionCodeSettings, false, 7));
    }

    @NonNull
    public Task<Void> verifyBeforeUpdateEmail(@NonNull String str) {
        return verifyBeforeUpdateEmail(str, null);
    }
}
