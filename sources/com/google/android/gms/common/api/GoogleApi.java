package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    @NonNull
    protected final GoogleApiManager zaa;
    private final Context zab;

    @Nullable
    private final String zac;

    @Nullable
    private final AttributionSourceWrapper zad;
    private final Api zae;
    private final Api.ApiOptions zaf;
    private final ApiKey zag;
    private final Looper zah;
    private final int zai;

    @Nullable
    private final UserHandle zaj;
    private final GoogleApiClient zak;
    private final StatusExceptionMapper zal;

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    @Nullable
    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static class Settings {

        @NonNull
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();

        @NonNull
        public final StatusExceptionMapper zaa;

        @NonNull
        public final Looper zab;

        @Nullable
        final UserHandle zac;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @Nullable
            private UserHandle zac;

            @NonNull
            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, null, this.zab, this.zac, null);
            }

            @NonNull
            @KeepForSdk
            public Builder setLooper(@NonNull Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @NonNull
            @KeepForSdk
            public Builder setMapper(@NonNull StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }

            @NonNull
            @RequiresPermission
            @RequiresApi
            @KeepForSdk
            public Builder setUserHandle(@NonNull UserHandle userHandle) {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.zac = userHandle;
                }
                return this;
            }

            @KeepForSdk
            public Builder() {
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, @Nullable UserHandle userHandle) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
            this.zac = userHandle;
        }

        public /* synthetic */ Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, UserHandle userHandle, byte[] bArr) {
            this(statusExceptionMapper, null, looper, userHandle);
        }
    }

    private final Task zae(int i, @NonNull TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zal(this, i, taskApiCall, taskCompletionSource, this.zal);
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zak;
    }

    @NonNull
    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zaf;
        boolean z = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        Account account = null;
        if (z && (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) != null) {
            String str = googleSignInAccount2.c;
            if (str != null) {
                account = new Account(str, AccountType.GOOGLE);
            }
        } else if (apiOptions instanceof Api.ApiOptions.HasAccountOptions) {
            account = ((Api.ApiOptions.HasAccountOptions) apiOptions).getAccount();
        }
        builder.zaa(account);
        Collection collectionR0 = (!z || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) ? Collections.EMPTY_SET : googleSignInAccount.r0();
        builder.zab(collectionR0);
        Context context = this.zab;
        builder.zac(context.getClass().getName());
        builder.setRealClientPackageName(context.getPackageName());
        return builder;
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaa.zaj(this);
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zao(this, listenerKey, i);
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @NonNull
    public final ApiKey<O> getApiKey() {
        return this.zag;
    }

    @NonNull
    @KeepForSdk
    public O getApiOptions() {
        return (O) this.zaf;
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @Nullable
    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        return this.zah;
    }

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l, @NonNull String str) {
        return ListenerHolders.createListenerHolder(l, this.zah, str);
    }

    public final int zab() {
        return this.zai;
    }

    public final zacl zac(Context context, Handler handler) {
        return new zacl(context, handler, createClientSettingsBuilder().build());
    }

    private GoogleApi(@NonNull Context context, @Nullable Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String apiFallbackAttributionTag;
        AttributionSourceWrapper attributionSourceWrapper;
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) Preconditions.checkNotNull(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            apiFallbackAttributionTag = ContextCompat.b(context);
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        if (i >= 31) {
            attributionSourceWrapper = new AttributionSourceWrapper(context.getAttributionSource());
        } else {
            attributionSourceWrapper = null;
        }
        this.zad = attributionSourceWrapper;
        this.zae = api;
        this.zaf = apiOptions;
        this.zah = settings.zab;
        UserHandle userHandle = settings.zac;
        this.zaj = userHandle;
        ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag, userHandle);
        this.zag = sharedApiKey;
        this.zak = new zabp(this);
        GoogleApiManager googleApiManagerZaa = GoogleApiManager.zaa(context2);
        this.zaa = googleApiManagerZaa;
        this.zai = googleApiManagerZaa.zac();
        this.zal = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaab.zaa(activity, googleApiManagerZaa, sharedApiKey);
        }
        googleApiManagerZaa.zad(this);
    }

    private final BaseImplementation.ApiMethodImpl zad(int i, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zak(this, i, apiMethodImpl);
        return apiMethodImpl;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, @NonNull U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zan(this, t, u, zab.zaa);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final Api.Client zaf(Looper looper, zabk zabkVar) {
        ClientSettings clientSettingsBuild = createClientSettingsBuilder().build();
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zae.zab())).buildClient(this.zab, looper, clientSettingsBuild, this.zaf, (GoogleApiClient.ConnectionCallbacks) zabkVar, (GoogleApiClient.OnConnectionFailedListener) zabkVar);
        UserHandle userHandle = this.zaj;
        if (userHandle != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setUserHandle(userHandle);
        }
        AttributionSourceWrapper attributionSourceWrapper = this.zad;
        if (attributionSourceWrapper != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionSourceWrapper(attributionSourceWrapper);
            return clientBuildClient;
        }
        if (attributionSourceWrapper != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zab(attributionSourceWrapper);
            return clientBuildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zaa(contextAttributionTag);
        }
        return clientBuildClient;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@NonNull T t) {
        zad(2, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@NonNull T t) {
        zad(0, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@NonNull T t) {
        zad(1, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        UnregisterListenerMethod unregisterListenerMethod = registrationMethods.zaa;
        Preconditions.checkNotNull(unregisterListenerMethod.getListenerKey(), "Listener has already been released.");
        return this.zaa.zan(this, registrationMethods.register, unregisterListenerMethod, registrationMethods.zab);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o, builder.build());
    }

    @KeepForSdk
    @MainThread
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o, @NonNull Settings settings) {
        this(activity, activity, api, o, settings);
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o, @NonNull Settings settings) {
        this(context, null, api, o, settings);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o, builder.build());
    }
}
