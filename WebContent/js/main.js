/**
 * Created by CallMeDad on 2018/8/26.
 */
function MenuDisplay_1() {

    var assay = document.getElementById("AssayInfo");
    var record = document.getElementById("RecordInfo");
    var specimen = document.getElementById("SpecimenInfo");

    assay.style.display="block";
    record.style.display="none";
    specimen.style.display="none";

}

function MenuDisplay_2() {

    var assay = document.getElementById("AssayInfo");
    var record = document.getElementById("RecordInfo");
    var specimen = document.getElementById("SpecimenInfo");

    specimen.style.display="none";
    record.style.display="block";
    assay.style.display="none";

}

function MenuDisplay_3() {

    var assay = document.getElementById("AssayInfo");
    var record = document.getElementById("RecordInfo");
    var specimen = document.getElementById("SpecimenInfo");

    record.style.display="none";
    assay.style.display="none";
    specimen.style.display="block";

}