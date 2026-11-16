package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yy0 {
    public static final Set a = n8.q0(new Character[]{'/', '?', '#', '@'});
    public static final int b;

    static {
        List list = ge1.b;
        b = 6;
        u12.b(eu.z("HTTP/1.0", "HTTP/1.1"), new l6(2), new q8(0));
    }

    public static final void a(nq nqVar, char c) {
        throw new eu1("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) nqVar));
    }

    public static final int b(nq nqVar, m12 m12Var) {
        int i = m12Var.c;
        for (int i2 = m12Var.b; i2 < i; i2++) {
            char cCharAt = nqVar.charAt(i2);
            if (cCharAt == ':' && i2 != m12Var.b) {
                m12Var.b = i2 + 1;
                return i2;
            }
            if (s71.h(cCharAt, 32) <= 0 || dk2.P("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = m12Var.b;
                if (cCharAt == ':') {
                    throw new eu1("Empty header names are not allowed as per RFC7230.");
                }
                if (i2 == i3) {
                    throw new eu1("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                }
                a(nqVar, cCharAt);
                throw null;
            }
        }
        throw new eu1("No colon in HTTP header in " + nqVar.subSequence(m12Var.b, m12Var.c).toString() + " in builder: \n" + ((Object) nqVar));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x006f, B:26:0x0077, B:30:0x007f, B:33:0x008a, B:36:0x0096, B:39:0x00a2, B:41:0x00a7, B:57:0x00d7, B:19:0x0055, B:44:0x00b0, B:53:0x00c6, B:54:0x00c9, B:55:0x00ca, B:56:0x00cf, B:58:0x00e5, B:59:0x00ec, B:60:0x00ed, B:62:0x00f7), top: B:66:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006a -> B:66:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.rl r17, defpackage.nq r18, defpackage.m12 r19, defpackage.fy r20) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy0.c(rl, nq, m12, fy):java.lang.Object");
    }

    public static final void d(lq lqVar) {
        if (dk2.S(":", lqVar)) {
            throw new eu1("Host header with ':' should contains port: " + ((Object) lqVar));
        }
        for (int i = 0; i < lqVar.length(); i++) {
            Character chValueOf = Character.valueOf(lqVar.charAt(i));
            Set set = a;
            if (set.contains(chValueOf)) {
                throw new eu1("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
