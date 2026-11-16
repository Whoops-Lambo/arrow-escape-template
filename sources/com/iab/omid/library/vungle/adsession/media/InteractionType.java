package com.iab.omid.library.vungle.adsession.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    public String interactionType;

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }

    InteractionType(String str) {
        this.interactionType = str;
    }
}
