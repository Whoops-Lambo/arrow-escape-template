package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface NetworkConfigParams {
    @Nullable
    String getFromNetworkParams(@NonNull String str);

    @Nullable
    @Deprecated(since = "3.5.0")
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable AdsFormat... adsFormatArr);

    @Nullable
    Map<String, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable String... strArr);

    @NonNull
    Map<String, String> obtainNetworkParams();

    @Nullable
    String removeFromNetworkParams(@NonNull String str);
}
