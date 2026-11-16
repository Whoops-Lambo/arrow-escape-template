package com.applovin.mediation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface MaxMediatedNetworkInfo {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);

        private final int a;

        public int getCode() {
            return this.a;
        }

        InitializationStatus(int i) {
            this.a = i;
        }

        public static InitializationStatus fromCode(int i) {
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == i) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
