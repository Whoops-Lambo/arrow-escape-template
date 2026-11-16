package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ra$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern kgy = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.kgy.matcher(str).matches();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #5 {Exception -> 0x0072, blocks: (B:29:0x006e, B:33:0x0076), top: B:58:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008a A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #3 {Exception -> 0x0086, blocks: (B:39:0x0082, B:43:0x008a), top: B:54:0x0082 }] */
    public static int ahm(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && ((i2 = Integer.parseInt(line)) < i3 || i3 == 0)) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception e) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRM6ObMVYnQ==", 140);
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRM6ObMVYnQ==", 130);
                            com.bytedance.sdk.component.utils.sx.rz("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception e2) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRM6ObMVYnQ==", 140);
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception e3) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRM6ObMVYnQ==", 140);
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:27:0x006b, B:31:0x0073), top: B:46:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0087 A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #5 {Exception -> 0x0083, blocks: (B:37:0x007f, B:41:0x0087), top: B:56:0x007f }] */
    public static int kgy(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && (i2 = Integer.parseInt(line)) > i3) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception e) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRMaYbMVYnQ==", 101);
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRMaYbMVYnQ==", 91);
                            com.bytedance.sdk.component.utils.sx.rz("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception e2) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRMaYbMVYnQ==", 101);
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception e3) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eP44oBe1ZdQ=", "XOs5thOpRMaYbMVYnQ==", 101);
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }

    public static int rz() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("cpu_max_frequency", 0);
    }

    public static int uq() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("cpu_min_frequency", 0);
    }

    public static int kgy() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int ahm() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("cpu_count", 0);
    }
}
