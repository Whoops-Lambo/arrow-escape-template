package io.p071bidmachine;

import com.facebook.appevents.k;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import defpackage.ar2;
import defpackage.dk2;
import defpackage.er;
import defpackage.h50;
import defpackage.nq2;
import defpackage.p8;
import defpackage.p92;
import defpackage.pv1;
import defpackage.qh1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.bidmachine.CrashTrackerKt, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\"\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013\"\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroid/content/Context;", "Ljava/io/File;", "crashDir", "(Landroid/content/Context;)Ljava/io/File;", "", "crashFiles", "(Landroid/content/Context;)[Ljava/io/File;", "", "applicationContext", "Laz2;", "saveCrashToFile", "(Ljava/lang/Throwable;Landroid/content/Context;)V", "", "", "parseCrash", "(Ljava/lang/String;)Ljava/util/Map;", "toErrorMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "CRASH_DIR_NAME", "Ljava/lang/String;", "", "CRASH_FILE_PARAMETER_DELIMITER", "C", "CRASH_FILE_KEY_START_MS", "CRASH_FILE_KEY_FINISH_MS", "CRASH_FILE_KEY_MESSAGE", "CRASH_FILE_KEY_EXTENDED_MESSAGE", "CRASH_DEFAULT_MESSAGE", "CRASH_DEFAULT_EXTENDED_MESSAGE", "bidmachine-android-sdk_ba_3_8_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class Context {

    @NotNull
    private static final String CRASH_DEFAULT_EXTENDED_MESSAGE = "Unknown";

    @NotNull
    private static final String CRASH_DEFAULT_MESSAGE = "Exception";

    @NotNull
    private static final String CRASH_DIR_NAME = "bidmachine/crashes";

    @NotNull
    private static final String CRASH_FILE_KEY_EXTENDED_MESSAGE = "extendedMessage";

    @NotNull
    private static final String CRASH_FILE_KEY_FINISH_MS = "finishMs";

    @NotNull
    private static final String CRASH_FILE_KEY_MESSAGE = "message";

    @NotNull
    private static final String CRASH_FILE_KEY_START_MS = "startMs";
    private static final char CRASH_FILE_PARAMETER_DELIMITER = '=';

    private static final String toErrorMessage(Throwable th) {
        if (th == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getName());
            String message = th.getMessage();
            if (message != null && message.length() != 0) {
                sb.append(": ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File crashDir(android.content.Context context) {
        return new File(context.getFilesDir(), CRASH_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File[] crashFiles(android.content.Context context) {
        File[] fileArrListFiles = crashDir(context).listFiles();
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> parseCrash(String str) {
        str.getClass();
        return qh1.f0(p92.H(new ar2(new p8(str, 5), j.q)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    public static final void saveCrashToFile(Throwable th, android.content.Context context) throws IOException {
        String errorMessage;
        File file = new File(context.getFilesDir(), CRASH_DIR_NAME);
        String str = null;
        if (!k.k(file) && !file.mkdirs()) {
            file = null;
        }
        if (file == null) {
            return;
        }
        long sessionStartTime = SessionManager.get().getSessionStartTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String errorMessage2 = toErrorMessage(th);
        if (errorMessage2 != null) {
            if (dk2.Z(errorMessage2)) {
                errorMessage2 = null;
            }
            if (errorMessage2 == null) {
                errorMessage2 = CRASH_DEFAULT_MESSAGE;
            }
        } else {
            errorMessage2 = CRASH_DEFAULT_MESSAGE;
        }
        Throwable cause = th.getCause();
        if (cause != null && (errorMessage = toErrorMessage(cause)) != null) {
            if (!dk2.Z(errorMessage)) {
                str = errorMessage;
            }
            if (str == null) {
                str = CRASH_DEFAULT_EXTENDED_MESSAGE;
            }
        } else {
            str = CRASH_DEFAULT_EXTENDED_MESSAGE;
        }
        StringBuilder sbO = h50.o(sessionStartTime, "startMs=", "\nfinishMs=");
        sbO.append(jCurrentTimeMillis);
        sbO.append("\nmessage=");
        sbO.append(errorMessage2);
        sbO.append("\nextendedMessage=");
        sbO.append(str);
        sbO.append('\n');
        String string = sbO.toString();
        FileOutputStream fileOutputStreamFileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(new File(file, pv1.m(jCurrentTimeMillis, "crash_", ".txt")));
        try {
            byte[] bytes = string.getBytes(er.a);
            bytes.getClass();
            fileOutputStreamFileOutputStreamCtor.write(bytes);
            fileOutputStreamFileOutputStreamCtor.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nq2.e(fileOutputStreamFileOutputStreamCtor, th2);
                throw th3;
            }
        }
    }
}
