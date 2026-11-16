package com.singular.sdk.internal;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class ErrorReporter {
    private static final SingularLog logger = SingularLog.getLogger("ErrorReporter");
    private final ConcurrentHashMap<String, Integer> errorsDictionary = new ConcurrentHashMap<>();

    public void collectError(String str) {
        try {
            Integer numValueOf = 1;
            if (this.errorsDictionary.containsKey(str) && (numValueOf = this.errorsDictionary.get(str)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
            }
            this.errorsDictionary.put(str, numValueOf);
        } catch (Throwable unused) {
            logger.debug("reportError failed");
        }
    }

    public HashMap<String, String> getCollectedErrors() {
        HashMap<String, String> map = new HashMap<>();
        try {
            if (!this.errorsDictionary.isEmpty()) {
                for (String str : this.errorsDictionary.keySet()) {
                    if (this.errorsDictionary.containsKey(str)) {
                        String string = this.errorsDictionary.get(str).toString();
                        if (Utils.isEmptyOrNull(string)) {
                            continue;
                        } else {
                            map.put(str, string);
                        }
                    }
                }
            }
            return map;
        } catch (Throwable unused) {
            logger.debug("getCollectedErrors failed");
            return map;
        }
    }

    public void resetErrors() {
        try {
            this.errorsDictionary.clear();
        } catch (Throwable unused) {
            logger.debug("resetErrors failed");
        }
    }
}
