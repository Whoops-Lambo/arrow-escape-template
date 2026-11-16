package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<ModuleAvailabilityResponse> areModulesAvailable(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<Void> deferredInstall(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<ModuleInstallIntentResponse> getInstallModulesIntent(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<ModuleInstallResponse> installModules(@NonNull ModuleInstallRequest moduleInstallRequest);

    @NonNull
    Task<Void> releaseModules(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<Boolean> unregisterListener(@NonNull InstallStatusListener installStatusListener);
}
