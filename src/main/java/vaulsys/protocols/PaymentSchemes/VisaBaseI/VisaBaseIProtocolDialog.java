package vaulsys.protocols.PaymentSchemes.VisaBaseI;

import vaulsys.protocols.base.ProtocolDialog;
import vaulsys.protocols.base.ProtocolMessage;
import vaulsys.protocols.ifx.imp.Ifx;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOMsg;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by m.rehman on 4/9/2016.
 */

public class VisaBaseIProtocolDialog implements ProtocolDialog {

    private Map<String, Map<Integer, Character>> msgElementDefinition;

    transient Logger logger = Logger.getLogger(VisaBaseIProtocolDialog.class);

    VisaBaseIProtocolDialog() {
        msgElementDefinition = new HashMap<String, Map<Integer, Character>>();

        //Message Element Definition for 0800
        msgElementDefinition.put("0800", new HashMap<Integer, Character>());
        msgElementDefinition.get("0800").put(7, 'M');
        msgElementDefinition.get("0800").put(11, 'M');
        msgElementDefinition.get("0800").put(37, 'C');
        msgElementDefinition.get("0800").put(48, 'C');
        msgElementDefinition.get("0800").put(70, 'M');

        //Message Element Definition for 0810
        msgElementDefinition.put("0810", new HashMap<Integer, Character>());
        msgElementDefinition.get("0810").put(7, 'M');
        msgElementDefinition.get("0810").put(11, 'M');
        msgElementDefinition.get("0810").put(37, 'C');
        msgElementDefinition.get("0810").put(39, 'M');
        msgElementDefinition.get("0810").put(70, 'M');

        //Message Element Definition for 0100
        msgElementDefinition.put("0100", new HashMap<Integer, Character>());
        msgElementDefinition.get("0100").put(2, 'C');
        msgElementDefinition.get("0100").put(3, 'M');
        msgElementDefinition.get("0100").put(4, 'M');
        msgElementDefinition.get("0100").put(6, 'C');
        msgElementDefinition.get("0100").put(7, 'M');
        msgElementDefinition.get("0100").put(10, 'C');
        msgElementDefinition.get("0100").put(11, 'M');
        msgElementDefinition.get("0100").put(14, 'C');
        msgElementDefinition.get("0100").put(18, 'M');
        msgElementDefinition.get("0100").put(19, 'M');
        msgElementDefinition.get("0100").put(22, 'C');
        msgElementDefinition.get("0100").put(23, 'C');
        msgElementDefinition.get("0100").put(25, 'M');
        msgElementDefinition.get("0100").put(26, 'C');
        msgElementDefinition.get("0100").put(28, 'C');
        msgElementDefinition.get("0100").put(32, 'M');
        msgElementDefinition.get("0100").put(33, 'C');
        msgElementDefinition.get("0100").put(35, 'C');
        msgElementDefinition.get("0100").put(37, 'M');
        msgElementDefinition.get("0100").put(39, 'C');
        msgElementDefinition.get("0100").put(41, 'C');
        msgElementDefinition.get("0100").put(42, 'C');
        msgElementDefinition.get("0100").put(43, 'C');
        msgElementDefinition.get("0100").put(44, 'C');
        msgElementDefinition.get("0100").put(45, 'C');
        msgElementDefinition.get("0100").put(48, 'C');
        msgElementDefinition.get("0100").put(49, 'M');
        msgElementDefinition.get("0100").put(51, 'C');
        msgElementDefinition.get("0100").put(52, 'C');
        msgElementDefinition.get("0100").put(53, 'C');
        msgElementDefinition.get("0100").put(54, 'C');
        msgElementDefinition.get("0100").put(55, 'C');
        msgElementDefinition.get("0100").put(59, 'C');
        msgElementDefinition.get("0100").put(60, 'C');
        msgElementDefinition.get("0100").put(61, 'C');
        msgElementDefinition.get("0100").put(62, 'C');
        msgElementDefinition.get("0100").put(63, 'C');
        msgElementDefinition.get("0100").put(100, 'C');
        msgElementDefinition.get("0100").put(102, 'C');
        msgElementDefinition.get("0100").put(103, 'C');
        msgElementDefinition.get("0100").put(104, 'C');
        msgElementDefinition.get("0100").put(115, 'C');
        msgElementDefinition.get("0100").put(117, 'C');
        msgElementDefinition.get("0100").put(118, 'C');
        msgElementDefinition.get("0100").put(121, 'C');
        msgElementDefinition.get("0100").put(123, 'C');
        msgElementDefinition.get("0100").put(125, 'C');
        msgElementDefinition.get("0100").put(126, 'C');
        msgElementDefinition.get("0100").put(127, 'C');

        //Message Element Definition for 0110
        msgElementDefinition.put("0110", new HashMap<Integer, Character>());
        msgElementDefinition.get("0110").put(2, 'C');
        msgElementDefinition.get("0110").put(3, 'M');
        msgElementDefinition.get("0110").put(4, 'M');
        msgElementDefinition.get("0110").put(6, 'C');
        msgElementDefinition.get("0110").put(7, 'M');
        msgElementDefinition.get("0110").put(10, 'C');
        msgElementDefinition.get("0110").put(11, 'M');
        msgElementDefinition.get("0110").put(14, 'C');
        msgElementDefinition.get("0110").put(19, 'M');
        msgElementDefinition.get("0110").put(22, 'C');
        msgElementDefinition.get("0110").put(23, 'C');
        msgElementDefinition.get("0110").put(25, 'C');
        msgElementDefinition.get("0110").put(32, 'M');
        msgElementDefinition.get("0110").put(37, 'M');
        msgElementDefinition.get("0110").put(38, 'C');
        msgElementDefinition.get("0110").put(39, 'M');
        msgElementDefinition.get("0110").put(41, 'C');
        msgElementDefinition.get("0110").put(42, 'M');
        msgElementDefinition.get("0110").put(44, 'C');
        msgElementDefinition.get("0110").put(48, 'C');
        msgElementDefinition.get("0110").put(49, 'M');
        msgElementDefinition.get("0110").put(51, 'C');
        msgElementDefinition.get("0110").put(54, 'C');
        msgElementDefinition.get("0110").put(55, 'C');
        msgElementDefinition.get("0110").put(62, 'C');
        msgElementDefinition.get("0110").put(63, 'C');
        msgElementDefinition.get("0110").put(73, 'C');
        msgElementDefinition.get("0110").put(91, 'C');
        msgElementDefinition.get("0110").put(101, 'C');
        msgElementDefinition.get("0110").put(102, 'C');
        msgElementDefinition.get("0110").put(103, 'C');
        msgElementDefinition.get("0110").put(104, 'C');
        msgElementDefinition.get("0110").put(115, 'C');
        msgElementDefinition.get("0110").put(116, 'C');
        msgElementDefinition.get("0110").put(117, 'C');
        msgElementDefinition.get("0110").put(118, 'C');
        msgElementDefinition.get("0110").put(121, 'C');
        msgElementDefinition.get("0110").put(123, 'C');
        msgElementDefinition.get("0110").put(126, 'C');
        msgElementDefinition.get("0110").put(127, 'C');

        //Message Element Definition for 0420
        msgElementDefinition.put("0420", new HashMap<Integer, Character>());
        msgElementDefinition.get("0420").put(2, 'C');
        msgElementDefinition.get("0420").put(3, 'M');
        msgElementDefinition.get("0420").put(4, 'M');
        msgElementDefinition.get("0420").put(6, 'C');
        msgElementDefinition.get("0420").put(7, 'M');
        msgElementDefinition.get("0420").put(10, 'C');
        msgElementDefinition.get("0420").put(11, 'M');
        msgElementDefinition.get("0420").put(14, 'C');
        msgElementDefinition.get("0420").put(18, 'M');
        msgElementDefinition.get("0420").put(19, 'C');
        msgElementDefinition.get("0420").put(22, 'C');
        msgElementDefinition.get("0420").put(23, 'C');
        msgElementDefinition.get("0420").put(25, 'M');
        msgElementDefinition.get("0420").put(28, 'C');
        msgElementDefinition.get("0420").put(32, 'M');
        msgElementDefinition.get("0420").put(33, 'C');
        msgElementDefinition.get("0420").put(37, 'M');
        msgElementDefinition.get("0420").put(38, 'C');
        msgElementDefinition.get("0420").put(39, 'M');
        msgElementDefinition.get("0420").put(41, 'C');
        msgElementDefinition.get("0420").put(42, 'C');
        msgElementDefinition.get("0420").put(43, 'C');
        msgElementDefinition.get("0420").put(44, 'M');
        msgElementDefinition.get("0420").put(48, 'M');
        msgElementDefinition.get("0420").put(49, 'C');
        msgElementDefinition.get("0420").put(51, 'C');
        msgElementDefinition.get("0420").put(54, 'C');
        msgElementDefinition.get("0420").put(55, 'C');
        msgElementDefinition.get("0420").put(59, 'C');
        msgElementDefinition.get("0420").put(60, 'M');
        msgElementDefinition.get("0420").put(61, 'C');
        msgElementDefinition.get("0420").put(62, 'M');
        msgElementDefinition.get("0420").put(63, 'M');
        msgElementDefinition.get("0420").put(90, 'M');
        msgElementDefinition.get("0420").put(95, 'C');
        msgElementDefinition.get("0420").put(100, 'C');
        msgElementDefinition.get("0420").put(102, 'C');
        msgElementDefinition.get("0420").put(103, 'C');
        msgElementDefinition.get("0420").put(104, 'C');
        msgElementDefinition.get("0420").put(117, 'C');
        msgElementDefinition.get("0420").put(118, 'C');
        msgElementDefinition.get("0420").put(123, 'C');
        msgElementDefinition.get("0420").put(126, 'C');

        //Message Element Definition for 0430
        msgElementDefinition.put("0430", new HashMap<Integer, Character>());
        msgElementDefinition.get("0430").put(2, 'C');
        msgElementDefinition.get("0430").put(3, 'M');
        msgElementDefinition.get("0430").put(4, 'M');
        msgElementDefinition.get("0430").put(7, 'M');
        msgElementDefinition.get("0430").put(11, 'M');
        msgElementDefinition.get("0430").put(19, 'C');
        msgElementDefinition.get("0430").put(25, 'M');
        msgElementDefinition.get("0430").put(32, 'M');
        msgElementDefinition.get("0430").put(33, 'M');
        msgElementDefinition.get("0430").put(37, 'M');
        msgElementDefinition.get("0430").put(39, 'M');
        msgElementDefinition.get("0430").put(41, 'M');
        msgElementDefinition.get("0430").put(42, 'M');
        msgElementDefinition.get("0430").put(48, 'C');
        msgElementDefinition.get("0430").put(49, 'C');
        msgElementDefinition.get("0430").put(54, 'C');
        msgElementDefinition.get("0430").put(62, 'C');
        msgElementDefinition.get("0430").put(63, 'M');
        msgElementDefinition.get("0430").put(90, 'C');
        msgElementDefinition.get("0430").put(95, 'C');
        msgElementDefinition.get("0430").put(100, 'C');
        msgElementDefinition.get("0430").put(102, 'C');
        msgElementDefinition.get("0430").put(115, 'C');
        msgElementDefinition.get("0430").put(121, 'C');
        msgElementDefinition.get("0430").put(122, 'C');
        msgElementDefinition.get("0430").put(123, 'C');
        msgElementDefinition.get("0430").put(126, 'C');

        //Message Element Definition for 0400
        msgElementDefinition.put("0400", new HashMap<Integer, Character>());
        msgElementDefinition.get("0400").put(2, 'C');
        msgElementDefinition.get("0400").put(3, 'M');
        msgElementDefinition.get("0400").put(4, 'M');
        msgElementDefinition.get("0400").put(6, 'C');
        msgElementDefinition.get("0400").put(7, 'M');
        msgElementDefinition.get("0400").put(10, 'C');
        msgElementDefinition.get("0400").put(11, 'M');
        msgElementDefinition.get("0400").put(14, 'C');
        msgElementDefinition.get("0400").put(18, 'M');
        msgElementDefinition.get("0400").put(19, 'C');
        msgElementDefinition.get("0400").put(22, 'C');
        msgElementDefinition.get("0400").put(23, 'C');
        msgElementDefinition.get("0400").put(25, 'M');
        msgElementDefinition.get("0400").put(28, 'C');
        msgElementDefinition.get("0400").put(32, 'M');
        msgElementDefinition.get("0400").put(33, 'C');
        msgElementDefinition.get("0400").put(37, 'M');
        msgElementDefinition.get("0400").put(38, 'C');
        msgElementDefinition.get("0400").put(39, 'C');
        msgElementDefinition.get("0400").put(41, 'C');
        msgElementDefinition.get("0400").put(42, 'C');
        msgElementDefinition.get("0400").put(43, 'C');
        msgElementDefinition.get("0400").put(44, 'C');
        msgElementDefinition.get("0400").put(48, 'C');
        msgElementDefinition.get("0400").put(49, 'C');
        msgElementDefinition.get("0400").put(51, 'C');
        msgElementDefinition.get("0400").put(54, 'C');
        msgElementDefinition.get("0400").put(55, 'C');
        msgElementDefinition.get("0400").put(59, 'C');
        msgElementDefinition.get("0400").put(60, 'M');
        msgElementDefinition.get("0400").put(61, 'C');
        msgElementDefinition.get("0400").put(62, 'C');
        msgElementDefinition.get("0400").put(63, 'M');
        msgElementDefinition.get("0400").put(90, 'M');
        msgElementDefinition.get("0400").put(95, 'C');
        msgElementDefinition.get("0400").put(100, 'C');
        msgElementDefinition.get("0400").put(102, 'C');
        msgElementDefinition.get("0400").put(103, 'C');
        msgElementDefinition.get("0400").put(104, 'C');
        msgElementDefinition.get("0400").put(117, 'C');
        msgElementDefinition.get("0400").put(118, 'C');
        msgElementDefinition.get("0400").put(123, 'C');
        msgElementDefinition.get("0400").put(126, 'C');

        //Message Element Definition for 0410
        msgElementDefinition.put("0410", new HashMap<Integer, Character>());
        msgElementDefinition.get("0410").put(2, 'C');
        msgElementDefinition.get("0410").put(3, 'M');
        msgElementDefinition.get("0410").put(4, 'M');
        msgElementDefinition.get("0410").put(7, 'M');
        msgElementDefinition.get("0410").put(11, 'M');
        msgElementDefinition.get("0410").put(19, 'C');
        msgElementDefinition.get("0410").put(23, 'C');
        msgElementDefinition.get("0410").put(25, 'M');
        msgElementDefinition.get("0410").put(32, 'M');
        msgElementDefinition.get("0410").put(37, 'M');
        msgElementDefinition.get("0410").put(39, 'M');
        msgElementDefinition.get("0410").put(41, 'C');
        msgElementDefinition.get("0410").put(42, 'C');
        msgElementDefinition.get("0410").put(44, 'C');
        msgElementDefinition.get("0410").put(48, 'C');
        msgElementDefinition.get("0410").put(49, 'C');
        msgElementDefinition.get("0410").put(51, 'C');
        msgElementDefinition.get("0410").put(54, 'C');
        msgElementDefinition.get("0410").put(55, 'C');
        msgElementDefinition.get("0410").put(62, 'C');
        msgElementDefinition.get("0410").put(63, 'M');
        msgElementDefinition.get("0410").put(90, 'C');
        msgElementDefinition.get("0410").put(95, 'C');
        msgElementDefinition.get("0410").put(102, 'C');
        msgElementDefinition.get("0410").put(103, 'C');
        msgElementDefinition.get("0410").put(104, 'C');
        msgElementDefinition.get("0410").put(115, 'C');
        msgElementDefinition.get("0410").put(117, 'C');
        msgElementDefinition.get("0410").put(118, 'C');
        msgElementDefinition.get("0410").put(121, 'C');
        msgElementDefinition.get("0410").put(123, 'C');
        msgElementDefinition.get("0410").put(126, 'C');

        //Message Element Definition for 0120
        msgElementDefinition.put("0120", new HashMap<Integer, Character>());
        msgElementDefinition.get("0120").put(2, 'C');
        msgElementDefinition.get("0120").put(3, 'M');
        msgElementDefinition.get("0120").put(4, 'M');
        msgElementDefinition.get("0120").put(6, 'C');
        msgElementDefinition.get("0120").put(7, 'M');
        msgElementDefinition.get("0120").put(10, 'C');
        msgElementDefinition.get("0120").put(11, 'M');
        msgElementDefinition.get("0120").put(12, 'M');
        msgElementDefinition.get("0120").put(13, 'M');
        msgElementDefinition.get("0120").put(14, 'C');
        msgElementDefinition.get("0120").put(18, 'M');
        msgElementDefinition.get("0120").put(19, 'M');
        msgElementDefinition.get("0120").put(22, 'C');
        msgElementDefinition.get("0120").put(25, 'M');
        msgElementDefinition.get("0120").put(26, 'C');
        msgElementDefinition.get("0120").put(28, 'C');
        msgElementDefinition.get("0120").put(32, 'M');
        msgElementDefinition.get("0120").put(33, 'C');
        msgElementDefinition.get("0120").put(37, 'M');
        msgElementDefinition.get("0120").put(38, 'C');
        msgElementDefinition.get("0120").put(39, 'C');
        msgElementDefinition.get("0120").put(41, 'C');
        msgElementDefinition.get("0120").put(42, 'C');
        msgElementDefinition.get("0120").put(43, 'C');
        msgElementDefinition.get("0120").put(44, 'M');
        msgElementDefinition.get("0120").put(48, 'C');
        msgElementDefinition.get("0120").put(49, 'M');
        msgElementDefinition.get("0120").put(51, 'C');
        msgElementDefinition.get("0120").put(54, 'C');
        msgElementDefinition.get("0120").put(59, 'C');
        msgElementDefinition.get("0120").put(60, 'C');
        msgElementDefinition.get("0120").put(61, 'C');
        msgElementDefinition.get("0120").put(62, 'M');
        msgElementDefinition.get("0120").put(63, 'M');
        msgElementDefinition.get("0120").put(68, 'C');
        msgElementDefinition.get("0120").put(73, 'C');
        msgElementDefinition.get("0120").put(91, 'C');
        msgElementDefinition.get("0120").put(100, 'C');
        msgElementDefinition.get("0120").put(101, 'C');
        msgElementDefinition.get("0120").put(102, 'C');
        msgElementDefinition.get("0120").put(103, 'C');
        msgElementDefinition.get("0120").put(104, 'C');
        msgElementDefinition.get("0120").put(117, 'C');
        msgElementDefinition.get("0120").put(118, 'C');
        msgElementDefinition.get("0120").put(121, 'C');
        msgElementDefinition.get("0120").put(123, 'C');
        msgElementDefinition.get("0120").put(125, 'C');
        msgElementDefinition.get("0120").put(126, 'C');
        msgElementDefinition.get("0120").put(127, 'C');

        //Message Element Definition for 0130
        msgElementDefinition.put("0130", new HashMap<Integer, Character>());
        msgElementDefinition.get("0130").put(2, 'C');
        msgElementDefinition.get("0130").put(3, 'M');
        msgElementDefinition.get("0130").put(4, 'M');
        msgElementDefinition.get("0130").put(7, 'M');
        msgElementDefinition.get("0130").put(11, 'M');
        msgElementDefinition.get("0130").put(19, 'M');
        msgElementDefinition.get("0130").put(23, 'C');
        msgElementDefinition.get("0130").put(25, 'M');
        msgElementDefinition.get("0130").put(32, 'M');
        msgElementDefinition.get("0130").put(37, 'M');
        msgElementDefinition.get("0130").put(39, 'M');
        msgElementDefinition.get("0130").put(41, 'C');
        msgElementDefinition.get("0130").put(42, 'C');
        msgElementDefinition.get("0130").put(49, 'M');
        msgElementDefinition.get("0130").put(62, 'C');
        msgElementDefinition.get("0130").put(63, 'M');

        //Message Element Definition for 0300
        msgElementDefinition.put("0300", new HashMap<Integer, Character>());
        msgElementDefinition.get("0300").put(7, 'M');
        msgElementDefinition.get("0300").put(11, 'M');
        msgElementDefinition.get("0300").put(32, 'M');
        msgElementDefinition.get("0300").put(37, 'M');
        msgElementDefinition.get("0300").put(41, 'C');
        msgElementDefinition.get("0300").put(42, 'C');
        msgElementDefinition.get("0300").put(73, 'C');
        msgElementDefinition.get("0300").put(91, 'M');
        msgElementDefinition.get("0300").put(92, 'C');
        msgElementDefinition.get("0300").put(101, 'M');
        msgElementDefinition.get("0300").put(127, 'C');

        //Message Element Definition for 0310
        msgElementDefinition.put("0310", new HashMap<Integer, Character>());
        msgElementDefinition.get("0310").put(7, 'M');
        msgElementDefinition.get("0310").put(11, 'M');
        msgElementDefinition.get("0310").put(32, 'M');
        msgElementDefinition.get("0310").put(37, 'M');
        msgElementDefinition.get("0310").put(39, 'M');
        msgElementDefinition.get("0310").put(41, 'C');
        msgElementDefinition.get("0310").put(42, 'C');
        msgElementDefinition.get("0310").put(48, 'C');
        msgElementDefinition.get("0310").put(73, 'C');
        msgElementDefinition.get("0310").put(91, 'M');
        msgElementDefinition.get("0310").put(92, 'C');
        msgElementDefinition.get("0310").put(101, 'M');
        msgElementDefinition.get("0310").put(127, 'C');

        //Message Element Definition for 0302
        msgElementDefinition.put("0302", new HashMap<Integer, Character>());
        msgElementDefinition.get("0302").put(2, 'C');
        msgElementDefinition.get("0302").put(7, 'M');
        msgElementDefinition.get("0302").put(11, 'M');
        msgElementDefinition.get("0302").put(19, 'M');
        msgElementDefinition.get("0302").put(32, 'C');
        msgElementDefinition.get("0302").put(37, 'C');
        msgElementDefinition.get("0302").put(62, 'C');
        msgElementDefinition.get("0302").put(63, 'C');
        msgElementDefinition.get("0302").put(73, 'C');
        msgElementDefinition.get("0302").put(91, 'M');
        msgElementDefinition.get("0302").put(92, 'C');
        msgElementDefinition.get("0302").put(101, 'M');
        msgElementDefinition.get("0302").put(115, 'C');
        msgElementDefinition.get("0302").put(121, 'C');
        msgElementDefinition.get("0302").put(123, 'C');
        msgElementDefinition.get("0302").put(127, 'C');

        //Message Element Definition for 0312
        msgElementDefinition.put("0312", new HashMap<Integer, Character>());
        msgElementDefinition.get("0312").put(2, 'C');
        msgElementDefinition.get("0312").put(7, 'M');
        msgElementDefinition.get("0312").put(11, 'M');
        msgElementDefinition.get("0312").put(15, 'C');
        msgElementDefinition.get("0312").put(19, 'M');
        msgElementDefinition.get("0312").put(32, 'C');
        msgElementDefinition.get("0312").put(37, 'C');
        msgElementDefinition.get("0312").put(39, 'M');
        msgElementDefinition.get("0312").put(48, 'C');
        msgElementDefinition.get("0312").put(62, 'C');
        msgElementDefinition.get("0312").put(63, 'C');
        msgElementDefinition.get("0312").put(73, 'C');
        msgElementDefinition.get("0312").put(91, 'M');
        msgElementDefinition.get("0312").put(92, 'C');
        msgElementDefinition.get("0312").put(101, 'M');
        msgElementDefinition.get("0312").put(115, 'C');
        msgElementDefinition.get("0312").put(121, 'C');
        msgElementDefinition.get("0312").put(123, 'C');
        msgElementDefinition.get("0312").put(127, 'C');

        //Message Element Definition for 0322
        msgElementDefinition.put("0322", new HashMap<Integer, Character>());
        msgElementDefinition.get("0322").put(2, 'C');
        msgElementDefinition.get("0322").put(7, 'M');
        msgElementDefinition.get("0322").put(11, 'M');
        msgElementDefinition.get("0322").put(32, 'C');
        msgElementDefinition.get("0322").put(37, 'C');
        msgElementDefinition.get("0322").put(62, 'C');
        msgElementDefinition.get("0322").put(63, 'C');
        msgElementDefinition.get("0322").put(73, 'C');
        msgElementDefinition.get("0322").put(91, 'M');
        msgElementDefinition.get("0322").put(101, 'M');
        msgElementDefinition.get("0322").put(127, 'C');

        //Message Element Definition for 0332
        msgElementDefinition.put("0332", new HashMap<Integer, Character>());
        msgElementDefinition.get("0332").put(2, 'C');
        msgElementDefinition.get("0332").put(7, 'M');
        msgElementDefinition.get("0332").put(11, 'M');
        msgElementDefinition.get("0332").put(32, 'C');
        msgElementDefinition.get("0332").put(37, 'C');
        msgElementDefinition.get("0332").put(39, 'M');
        msgElementDefinition.get("0332").put(63, 'C');
        msgElementDefinition.get("0332").put(73, 'C');
        msgElementDefinition.get("0332").put(91, 'M');
        msgElementDefinition.get("0332").put(101, 'M');
        msgElementDefinition.get("0332").put(127, 'C');

        //Message Element Definition for 0620
        msgElementDefinition.put("0620", new HashMap<Integer, Character>());
        msgElementDefinition.get("0620").put(2, 'M');
        msgElementDefinition.get("0620").put(7, 'M');
        msgElementDefinition.get("0620").put(11, 'M');
        msgElementDefinition.get("0620").put(14, 'C');
        msgElementDefinition.get("0620").put(15, 'C');
        msgElementDefinition.get("0620").put(33, 'M');
        msgElementDefinition.get("0620").put(37, 'C');
        msgElementDefinition.get("0620").put(39, 'M');
        msgElementDefinition.get("0620").put(48, 'C');
        msgElementDefinition.get("0620").put(62, 'M');
        msgElementDefinition.get("0620").put(63, 'M');
        msgElementDefinition.get("0620").put(70, 'M');
        msgElementDefinition.get("0620").put(101, 'C');
        msgElementDefinition.get("0620").put(115, 'C');
        msgElementDefinition.get("0620").put(123, 'M');
        msgElementDefinition.get("0620").put(125, 'M');
        msgElementDefinition.get("0620").put(127, 'C');

        //Message Element Definition for 0630
        msgElementDefinition.put("0630", new HashMap<Integer, Character>());
        msgElementDefinition.get("0630").put(2, 'M');
        msgElementDefinition.get("0630").put(7, 'M');
        msgElementDefinition.get("0630").put(11, 'M');
        msgElementDefinition.get("0630").put(15, 'C');
        msgElementDefinition.get("0630").put(37, 'C');
        msgElementDefinition.get("0630").put(39, 'M');
        msgElementDefinition.get("0630").put(62, 'M');
        msgElementDefinition.get("0630").put(63, 'M');
        msgElementDefinition.get("0630").put(70, 'M');
        msgElementDefinition.get("0630").put(115, 'C');
    }

    @Override
    public Ifx refine(Ifx ifx) {
        return ifx;
    }

    @Override
    public ProtocolMessage refine(ProtocolMessage protocolMessage) throws Exception {

        ISOMsg isoMsg = (ISOMsg) protocolMessage;
        String mti = isoMsg.getMTI();

        ArrayList<Integer> removedFields = new ArrayList<Integer>();
        ArrayList<Integer> neededFields = new ArrayList<Integer>();

        try {
            for (int i = 2; i < 128; i++) { //field counter
                if (isoMsg.hasField(i) && !msgElementDefinition.get(mti).containsKey(i)) {
                    if (isoMsg.getDirection() == ISOMsg.OUTGOING)
                        isoMsg.unset(i);    //unset fld i
                    removedFields.add(i);
                }
                else if (!isoMsg.hasField(i) && msgElementDefinition.get(mti).containsKey(i)) {
                    if (msgElementDefinition.get(mti).get(i) == 'M') {
                        neededFields.add(i);
                    }
                }
            }

            if (removedFields.size() != 0 || neededFields.size() != 0) {
                if (removedFields.size() != 0) {
                    logger.error("Message does have fields " + removedFields.toString() + " but it should not. Error occurred.");
                }
                if (neededFields.size() != 0) {
                    logger.error("Message doesn't have fields " + neededFields.toString() + " but it should have. Error occurred..");
                }
                //set message status
                isoMsg.setMessageStatus(ISOMsg.INVALID);
            }

            return protocolMessage;
        } catch (Exception ex) {
            if (true)
                return null;
        }

        return null;
    }

    ////Raza Adding for Field traslation start
    @Override
    public ProtocolMessage TranslateToFanap(ProtocolMessage protocolMessage) throws Exception
    {
        logger.info("Translating incoming message from VisaBaseI...");
        return protocolMessage;
    }

    @Override
    public ProtocolMessage TranslateFromFanap(ProtocolMessage protocolMessage) throws Exception
    {
        logger.info("Translating outgoing message for VisaBaseI...");
        return protocolMessage;
    }
    ////Raza Adding for Field traslation end
}