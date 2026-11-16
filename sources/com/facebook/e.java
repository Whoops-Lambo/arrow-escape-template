package com.facebook;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ AccessToken b;
    public final /* synthetic */ a c;
    public final /* synthetic */ AtomicBoolean d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ HashSet f;
    public final /* synthetic */ HashSet g;
    public final /* synthetic */ i h;

    /* JADX WARN: Code duplicated, block: B:31:0x008e A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00db A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0019, B:5:0x0023, B:7:0x002b, B:11:0x0033, B:14:0x0039, B:19:0x0045, B:22:0x0053, B:24:0x005b, B:29:0x008a, B:31:0x008e, B:32:0x0090, B:37:0x00a4, B:42:0x00b2, B:47:0x00c0, B:49:0x00c9, B:53:0x00db, B:54:0x00dd, B:51:0x00d6, B:46:0x00bd, B:41:0x00af, B:36:0x00a1, B:26:0x006a, B:28:0x0070, B:64:0x00ff), top: B:74:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        AccessToken accessToken;
        com.explorestack.protobuf.adcom.c cVar;
        Date date;
        long j;
        Collection collection;
        Collection collection2;
        Collection collection3;
        Date date2;
        AccessToken accessToken2 = this.b;
        a aVar = this.c;
        AtomicBoolean atomicBoolean = this.d;
        AtomicBoolean atomicBoolean2 = this.h.d;
        h hVar = this.a;
        String str = hVar.a;
        int i = hVar.b;
        Long l = (Long) hVar.e;
        String str2 = hVar.d;
        try {
            com.explorestack.protobuf.adcom.c cVar2 = i.f;
            if (cVar2.h().c != null) {
                AccessToken accessToken3 = cVar2.h().c;
                if ((accessToken3 != null ? accessToken3.i : null) == accessToken2.i) {
                    if (!atomicBoolean.get() && str == null && i == 0) {
                        if (aVar != null) {
                            aVar.OnTokenRefreshFailed(new u("Failed to refresh access token"));
                        }
                        atomicBoolean2.set(false);
                        return;
                    }
                    Date date3 = accessToken2.a;
                    try {
                        if (hVar.b == 0) {
                            cVar = cVar2;
                            if (hVar.c != 0) {
                                date = new Date((((long) hVar.c) * 1000) + new Date().getTime());
                                j = 1000;
                            }
                            if (str == null) {
                                str = accessToken2.e;
                            }
                            String str3 = str;
                            String str4 = accessToken2.h;
                            String str5 = accessToken2.i;
                            if (atomicBoolean.get()) {
                                collection = this.e;
                            } else {
                                collection = accessToken2.b;
                            }
                            Collection collection4 = collection;
                            if (atomicBoolean.get()) {
                                collection2 = this.f;
                            } else {
                                collection2 = accessToken2.c;
                            }
                            Collection collection5 = collection2;
                            if (atomicBoolean.get()) {
                                collection3 = this.g;
                            } else {
                                collection3 = accessToken2.d;
                            }
                            Collection collection6 = collection3;
                            j jVar = accessToken2.f;
                            Date date4 = new Date();
                            if (l != null) {
                                date2 = new Date(l.longValue() * j);
                            } else {
                                date2 = accessToken2.j;
                            }
                            Date date5 = date2;
                            if (str2 == null) {
                                str2 = accessToken2.k;
                            }
                            accessToken = new AccessToken(str3, str4, str5, collection4, collection5, collection6, jVar, date, date4, date5, str2);
                            cVar.h().d(accessToken, true);
                            atomicBoolean2.set(false);
                            if (aVar != null) {
                                aVar.OnTokenRefreshed(accessToken);
                                return;
                            }
                            return;
                        }
                        cVar = cVar2;
                        date3 = new Date(((long) hVar.b) * 1000);
                        cVar.h().d(accessToken, true);
                        atomicBoolean2.set(false);
                        if (aVar != null) {
                            aVar.OnTokenRefreshed(accessToken);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        atomicBoolean2.set(false);
                        if (aVar != null && accessToken != null) {
                            aVar.OnTokenRefreshed(accessToken);
                        }
                        throw th;
                    }
                    date = date3;
                    j = 1000;
                    if (str == null) {
                        str = accessToken2.e;
                    }
                    String str6 = str;
                    String str7 = accessToken2.h;
                    String str8 = accessToken2.i;
                    if (atomicBoolean.get()) {
                        collection = this.e;
                    } else {
                        collection = accessToken2.b;
                    }
                    Collection collection7 = collection;
                    if (atomicBoolean.get()) {
                        collection2 = this.f;
                    } else {
                        collection2 = accessToken2.c;
                    }
                    Collection collection8 = collection2;
                    if (atomicBoolean.get()) {
                        collection3 = this.g;
                    } else {
                        collection3 = accessToken2.d;
                    }
                    Collection collection9 = collection3;
                    j jVar2 = accessToken2.f;
                    Date date6 = new Date();
                    if (l != null) {
                        date2 = new Date(l.longValue() * j);
                    } else {
                        date2 = accessToken2.j;
                    }
                    Date date7 = date2;
                    if (str2 == null) {
                        str2 = accessToken2.k;
                    }
                    accessToken = new AccessToken(str6, str7, str8, collection7, collection8, collection9, jVar2, date, date6, date7, str2);
                }
            }
            if (aVar != null) {
                aVar.OnTokenRefreshFailed(new u("No current access token to refresh"));
            }
            atomicBoolean2.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken = null;
        }
    }

    public /* synthetic */ e(h hVar, AccessToken accessToken, a aVar, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, i iVar) {
        this.a = hVar;
        this.b = accessToken;
        this.c = aVar;
        this.d = atomicBoolean;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = hashSet3;
        this.h = iVar;
    }
}
