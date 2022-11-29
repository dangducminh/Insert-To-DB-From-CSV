package com.example.InsertToDBFromCSV;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ReadExcel {

	private static final String FILE_NAME = "C:\\";

	public List<ComponentEntity> readData(String urlFile) {
		urlFile = FILE_NAME.concat(urlFile);
		List<ComponentEntity> componentEntityList = new ArrayList<>();

		try {

			FileInputStream excelFile = new FileInputStream(new File(urlFile));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();
				int index = 0;
				ComponentEntity componentEntity = new ComponentEntity();
				boolean check = true;
				while (cellIterator.hasNext()) {

					Cell currentCell = cellIterator.next();
					//getCellTypeEnum shown as deprecated for version 3.15
					//getCellTypeEnum ill be renamed to getCellType starting from version 4.0
					if (currentCell.getStringCellValue().equals("DELIVERY BATCH")) {
						check = false;
						break;
					};
					if (index==0){
						//DELIVERY BATCH
					index++;
					check=true;
					}else if(index==1){
						//CALCULATION AREA
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==2){
						//DRAWING
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setDrawing(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==3){
						//ESTOP
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==4){
						//PLC AREA
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==5){
						//SCREEN
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setScreen(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==6){
						//SEQUENCE GROUP
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setSequenceGroup(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==7){
						//LINE  NAME
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setLineName(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==8){
						//BUILDING SECTION
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setBuildingSection(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==9){
						//INSTALLATION SECTION
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setInstallationSection(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==10){
						//Component unique id // cai nay la object nen em dang cmt lai trong class entiti line 762
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==11){
						//Color group
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setColorGroup(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==12){
						//Status
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==13){
						//BoM Status
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==14){
						//Pos No
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setPosNo(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==15){
						//Reference
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setReference(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==16){
						//Type Id
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setTypeID(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==17){
						//Throughput
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setThroughput((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==18){
						//Comment
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setComment(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==19){
						//Total Length
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setLengthTotal((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==20){
						//Width
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setWidth((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==21){
						//Speed
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");

						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSpeed(String.valueOf(currentCell.getNumericCellValue()));
						}
						check=true;index++;
					}else if(index==22){
						//Motor controller
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setMotorController(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==23){
						//Unit reversible
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUnitReversible((currentCell.getStringCellValue().equals("No"))?Boolean.FALSE:Boolean.TRUE);
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==24){
						//Rotation
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setRotation((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==25){
						//Rotation 3D
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setRotation3D(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==26){
						//Plant domain
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setPlantDomain(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==27){
						//Amount buffer electric
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setAmountBufferElec((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==28){
						//Amount buffer mechanic
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setAmountBufferMech((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==29){
						//Buffer size
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setBufferSize((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==30){
						//Drive position
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setDrivePosition(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==31){
						//Motor direction
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setMotorDirection(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==32){
						//Curve angle
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setCurveAngle((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==33){
						//Curve direction
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setCurveDirection(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==34){
						//Curve radius
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setCurveRadius((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==35){
						//Break type
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setBreakType(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==36){
						//Section1 Angle
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection1Angle(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==37){
						//Section1 Length
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection1Length(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==38){
						//Section2 Angle
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection2Angle(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==39){
						//Section2 Length
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection2Length(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==40){
						//Section3 Angle
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection3Angle(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==41){
						//Section3 Length
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection3Length(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==42){
						//Section4 Angle
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSection4Angle(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==43){
						//Slave Drive
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setSlaveDrive(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==44){
						//Usage
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUsage(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==45){
						//Drive station
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setDriveStation(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==46){
						//Start stop cycles
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setStartStopCycles((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==47){
						//Version
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setVersion((int) currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==48){
						//Slope
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setSlope(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==49){
						//Parent
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setParent(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==50){
						//Creation Date
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==51){
						//Modification Date
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==52){
						//AKZ
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setAkz(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==53){
						//Customer AKZ
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setCustomerAKZ(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==54){
						//User1
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUser1(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==55){
						//User2
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUser2(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==56){
						//User3
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUser3(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==57){
						//User4
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUser4(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==58){
						//User5
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setUser5(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==59){
						//DrivePulleyDiameter
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setDrivePulleyDiameter(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==60){
						//DriveShaftDiameter
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setDriveShaftDiameter(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==61){
						//Acceleration
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
							componentEntity.setAcceleration(currentCell.getNumericCellValue());
						}
						check=true;index++;
					}else if(index==62){
						//StorageConveyor
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setStorageConveyor(currentCell.getStringCellValue().equals("No")?Boolean.FALSE:Boolean.TRUE);
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==63){
						//3DOutfit
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==64){
						//ParcelTypeID
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setParcelTypeID(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==65){
						//OrderPlant
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setOrderPlant(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}else if(index==66) {
						//DesignPlant
						if (currentCell.getCellTypeEnum() == CellType.STRING) {
							System.out.print(currentCell.getStringCellValue() + "--");
							componentEntity.setDesignPlant(currentCell.getStringCellValue());
						} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
							System.out.print(currentCell.getNumericCellValue() + "--");
						}
						check=true;index++;
					}
				}
				if (check) componentEntityList.add(componentEntity);
			}
			return componentEntityList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
