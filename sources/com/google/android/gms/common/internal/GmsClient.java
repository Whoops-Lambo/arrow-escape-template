package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import defpackage.e32;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zat {

    @Nullable
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set zac;

    @Nullable
    private final Account zad;

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }

    @VisibleForTesting
    public GmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailability googleApiAvailability, int i, @NonNull ClientSettings clientSettings, @Nullable ConnectionCallbacks connectionCallbacks, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, connectionCallbacks == null ? null : new zap(connectionCallbacks), onConnectionFailedListener != null ? new zaq(onConnectionFailedListener) : null, clientSettings.zab());
        this.zab = clientSettings;
        this.zad = clientSettings.getAccount();
        this.zac = zac(clientSettings.getAllRequestedScopes());
        zab(context);
    }

    private static void zab(Context context) {
        if (zaa == null) {
            synchronized (GmsClient.class) {
                try {
                    if (zaa == null && GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName())) {
                        zaa = zas.zaa(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void zag(@Nullable Executor executor) {
        zaa = executor;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    @KeepForSdk
    public Executor getBindServiceExecutor() {
        return zaa;
    }

    @NonNull
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    private final Set zac(@NonNull Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                e32.i("Expanding scopes is not permitted, use implied scopes instead");
                return null;
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.EMPTY_SET;
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, null, null);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @KeepForSdk
    @VisibleForTesting
    public GmsClient(@NonNull Context context, @NonNull Handler handler, int i, @NonNull ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, null, null);
        this.zab = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zad = clientSettings.getAccount();
        this.zac = zac(clientSettings.getAllRequestedScopes());
        zab(context);
    }
}
