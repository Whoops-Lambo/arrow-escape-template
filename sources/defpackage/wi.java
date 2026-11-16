package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum wi {
    cmpId(12),
    cmpVersion(12),
    consentLanguage(12),
    consentScreen(6),
    created(36),
    isServiceSpecific(1),
    lastUpdated(36),
    policyVersion(6),
    publisherCountryCode(12),
    publisherLegitimateInterests(24),
    publisherConsents(24),
    purposeConsents(24),
    purposeLegitimateInterests(24),
    purposeOneTreatment(1),
    specialFeatureOptins(12),
    useNonStandardStacks(1),
    vendorListVersion(12),
    version(6),
    anyBoolean(1),
    encodingType(1),
    maxId(16),
    numCustomPurposes(6),
    numEntries(12),
    numRestrictions(12),
    purposeId(6),
    restrictionType(2),
    segmentType(3),
    singleOrRange(1),
    vendorId(16);


    @NotNull
    public static final vi Companion = new vi();
    public final int a;

    wi(int i) {
        this.a = i;
    }
}
