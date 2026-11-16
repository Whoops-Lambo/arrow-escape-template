package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    @Nullable
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private RemoteCall zaa;
        private Feature[] zad;
        private boolean zab = false;
        private boolean zac = false;
        private int zae = 0;

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zac = true;
            this.zab = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            boolean z = true;
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            if (!this.zac) {
                Feature[] featureArr = this.zad;
                if (featureArr == null || (featureArr.length) == 0) {
                    z = false;
                    break;
                }
                for (Feature feature : featureArr) {
                    if (!feature.getIsFullyRolledOut()) {
                        z = false;
                        break;
                    }
                }
                this.zab = z;
            }
            return new zacm(this, this.zad, this.zab, this.zae);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@NonNull final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacn
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    biConsumer.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> run(@NonNull RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@NonNull Feature... featureArr) {
            this.zad = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.zae = i;
            return this;
        }

        public final /* synthetic */ RemoteCall zaa() {
            return this.zaa;
        }

        private Builder() {
        }

        public /* synthetic */ Builder(byte[] bArr) {
        }
    }

    @KeepForSdk
    public abstract void doExecute(@NonNull A a, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(null);
    }

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    @Nullable
    public final Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i) {
        this.zaa = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.zab = z2;
        this.zac = i;
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }
}
