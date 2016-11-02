package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <br>(Source path: <i>META-INF/yang/toaster.yang</i>):
 * <pre>
 * container input {
 *     leaf toasterDoneness {
 *         type toasterDoneness;
 *     }
 *     leaf toasterToastType {
 *         type toasterToastType;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>toaster/make-toast/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInputBuilder
 *
 */
public interface MakeToastInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster",
        "2009-11-20", "input").intern();

    /**
     * This variable controls how well-done is the ensuing toast. It should be on a 
     * scale of 1 to 10. Toast made at 10 generally is considered unfit for human 
     * consumption; toast made at 1 is warmed lightly.
     *
     */
    java.lang.Long getToasterDoneness();
    
    /**
     * This variable informs the toaster of the type of material that is being toasted.
     * The toaster uses this information, combined with toasterDoneness, to compute for
     * how long the material must be toasted to achieve the required doneness.
     *
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType();

}

