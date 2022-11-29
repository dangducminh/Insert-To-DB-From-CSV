package com.example.InsertToDBFromCSV;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;


@Entity
@Table(name = "component")
public class ComponentEntity {

	//has to be all lower case otherwise hibernate throws errors
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "component_id_seq_gen")
	@SequenceGenerator(name = "component_id_seq_gen", sequenceName = "component_id_seq", initialValue = 212178185)
	private Long id;
	private Integer amountBufferElec;
	private Integer amountBufferMech;
	private String breakType;
	private Integer bufferSize;
	private String buildSection;
	private String calculationArea;
	private String comment;
	private Integer curveAngle;
	private String curveDirection;
	private Integer curveRadius;
	private String drawing;
	private String drivePosition;
	private String driveStation;
	private String eStopGroup;
	private Integer height;
	private Integer lengthTotal;
	private Double load;
	private String motorController;
	private String motorDirection;
	private String motorPosition;
	private String plcArea;
	private String parent;
	private String plantDomain;
	private String posNo;
	private String reference;
	private Integer rotation;
	private Double rotation3D;
	private String screen;
	private Double section1Angle;
	private Double section1Length;
	private Double section2Angle;
	private Double section2Length;
	private Double section3Angle;
	private Double section3Length;
	private Double section4Angle;
	private Double section4Length;
	private String sequenceGroup;
	private String slaveDrive;
	private Double slope;
	private String speed;
	private Integer startStopCycles;
	private String supplier;
	private Integer throughput;
	private String typeID;
	private Boolean unitReversible;
	private String usage;
	private Integer version;
	private String virtual;
	private Integer width;
	private Integer installationHours;
	private Integer engineeringHours;
	private String colorGroup;
	private String akz;
	private String customerAKZ;
	private String autoCadLayer;
	private String user1;
	private String user2;
	private String user3;
	private String user4;
	private String user5;
	private String lineName;
	private String buildingSection;
	private String installationSection;
	private String driveSide;
	private String angleCorr;
	private String levelStart;
	private String levelEnd;
	private String controlNr;
	private String vaultInstance;
	private String drawingVersion;
	private String drawingRevision;
	private String outfit3D;
	private String parcelTypeID;
	private String orderPlant;
	private String designPlant;
	private Boolean storageConveyor;
	private Double drivePulleyDiameter;
	private Double driveShaftDiameter;
	private Double acceleration;


//	private Set<GroupEntity> groups = new HashSet<>();
//
//
//	@Fetch(value = FetchMode.SUBSELECT)
//	private List<ConnectionPointEntity> connectionPoints = new ArrayList<>();
//
//	@Fetch(value = FetchMode.SUBSELECT)
//	private List<DecompositionEntity> decompositions = new ArrayList<>();
//
//	@JoinColumn(name = "position")
//	private PositionEntity position;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAmountBufferElec() {
		return amountBufferElec;
	}

	public void setAmountBufferElec(Integer amountBufferElec) {
		this.amountBufferElec = amountBufferElec;
	}

	public Integer getAmountBufferMech() {
		return amountBufferMech;
	}

	public void setAmountBufferMech(Integer amountBufferMech) {
		this.amountBufferMech = amountBufferMech;
	}

	public String getBreakType() {
		return breakType;
	}

	public void setBreakType(String breakType) {
		this.breakType = breakType;
	}

	public Integer getBufferSize() {
		return bufferSize;
	}

	public void setBufferSize(Integer bufferSize) {
		this.bufferSize = bufferSize;
	}

	public String getBuildSection() {
		return buildSection;
	}

	public void setBuildSection(String buildSection) {
		this.buildSection = buildSection;
	}

	public String getCalculationArea() {
		return calculationArea;
	}

	public void setCalculationArea(String calculationArea) {
		this.calculationArea = calculationArea;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCurveAngle() {
		return curveAngle;
	}

	public void setCurveAngle(Integer curveAngle) {
		this.curveAngle = curveAngle;
	}

	public String getCurveDirection() {
		return curveDirection;
	}

	public void setCurveDirection(String curveDirection) {
		this.curveDirection = curveDirection;
	}

	public Integer getCurveRadius() {
		return curveRadius;
	}

	public void setCurveRadius(Integer curveRadius) {
		this.curveRadius = curveRadius;
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}

	public String getDrivePosition() {
		return drivePosition;
	}

	public void setDrivePosition(String drivePosition) {
		this.drivePosition = drivePosition;
	}

	public String getDriveStation() {
		return driveStation;
	}

	public void setDriveStation(String driveStation) {
		this.driveStation = driveStation;
	}

	public String geteStopGroup() {
		return eStopGroup;
	}

	public void seteStopGroup(String eStopGroup) {
		this.eStopGroup = eStopGroup;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getLengthTotal() {
		return lengthTotal;
	}

	public void setLengthTotal(Integer lengthTotal) {
		this.lengthTotal = lengthTotal;
	}

	public Double getLoad() {
		return load;
	}

	public void setLoad(Double load) {
		this.load = load;
	}

	public String getMotorController() {
		return motorController;
	}

	public void setMotorController(String motorController) {
		this.motorController = motorController;
	}

	public String getMotorDirection() {
		return motorDirection;
	}

	public void setMotorDirection(String motorDirection) {
		this.motorDirection = motorDirection;
	}

	public String getMotorPosition() {
		return motorPosition;
	}

	public void setMotorPosition(String motorPosition) {
		this.motorPosition = motorPosition;
	}

	public String getPlcArea() {
		return plcArea;
	}

	public void setPlcArea(String plcArea) {
		this.plcArea = plcArea;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getPlantDomain() {
		return plantDomain;
	}

	public void setPlantDomain(String plantDomain) {
		this.plantDomain = plantDomain;
	}

	public String getPosNo() {
		return posNo;
	}

	public void setPosNo(String posNo) {
		this.posNo = posNo;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public Double getRotation3D() {
		return rotation3D;
	}

	public void setRotation3D(Double rotation3D) {
		this.rotation3D = rotation3D;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public Double getSection1Angle() {
		return section1Angle;
	}

	public void setSection1Angle(Double section1Angle) {
		this.section1Angle = section1Angle;
	}

	public Double getSection1Length() {
		return section1Length;
	}

	public void setSection1Length(Double section1Length) {
		this.section1Length = section1Length;
	}

	public Double getSection2Angle() {
		return section2Angle;
	}

	public void setSection2Angle(Double section2Angle) {
		this.section2Angle = section2Angle;
	}

	public Double getSection2Length() {
		return section2Length;
	}

	public void setSection2Length(Double section2Length) {
		this.section2Length = section2Length;
	}

	public Double getSection3Angle() {
		return section3Angle;
	}

	public void setSection3Angle(Double section3Angle) {
		this.section3Angle = section3Angle;
	}

	public Double getSection3Length() {
		return section3Length;
	}

	public void setSection3Length(Double section3Length) {
		this.section3Length = section3Length;
	}

	public Double getSection4Angle() {
		return section4Angle;
	}

	public void setSection4Angle(Double section4Angle) {
		this.section4Angle = section4Angle;
	}

	public Double getSection4Length() {
		return section4Length;
	}

	public void setSection4Length(Double section4Length) {
		this.section4Length = section4Length;
	}

	public String getSequenceGroup() {
		return sequenceGroup;
	}

	public void setSequenceGroup(String sequenceGroup) {
		this.sequenceGroup = sequenceGroup;
	}

	public String getSlaveDrive() {
		return slaveDrive;
	}

	public void setSlaveDrive(String slaveDrive) {
		this.slaveDrive = slaveDrive;
	}

	public Double getSlope() {
		return slope;
	}

	public void setSlope(Double slope) {
		this.slope = slope;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Integer getStartStopCycles() {
		return startStopCycles;
	}

	public void setStartStopCycles(Integer startStopCycles) {
		this.startStopCycles = startStopCycles;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Integer getThroughput() {
		return throughput;
	}

	public void setThroughput(Integer throughput) {
		this.throughput = throughput;
	}

	public String getTypeID() {
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public Boolean getUnitReversible() {
		return unitReversible;
	}

	public void setUnitReversible(Boolean unitReversible) {
		this.unitReversible = unitReversible;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getVirtual() {
		return virtual;
	}

	public void setVirtual(String virtual) {
		this.virtual = virtual;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getInstallationHours() {
		return installationHours;
	}

	public void setInstallationHours(Integer installationHours) {
		this.installationHours = installationHours;
	}

	public Integer getEngineeringHours() {
		return engineeringHours;
	}

	public void setEngineeringHours(Integer engineeringHours) {
		this.engineeringHours = engineeringHours;
	}

	public String getColorGroup() {
		return colorGroup;
	}

	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	public String getAkz() {
		return akz;
	}

	public void setAkz(String akz) {
		this.akz = akz;
	}

	public String getCustomerAKZ() {
		return customerAKZ;
	}

	public void setCustomerAKZ(String customerAKZ) {
		this.customerAKZ = customerAKZ;
	}

	public String getAutoCadLayer() {
		return autoCadLayer;
	}

	public void setAutoCadLayer(String autoCadLayer) {
		this.autoCadLayer = autoCadLayer;
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2;
	}

	public String getUser3() {
		return user3;
	}

	public void setUser3(String user3) {
		this.user3 = user3;
	}

	public String getUser4() {
		return user4;
	}

	public void setUser4(String user4) {
		this.user4 = user4;
	}

	public String getUser5() {
		return user5;
	}

	public void setUser5(String user5) {
		this.user5 = user5;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getBuildingSection() {
		return buildingSection;
	}

	public void setBuildingSection(String buildingSection) {
		this.buildingSection = buildingSection;
	}

	public String getInstallationSection() {
		return installationSection;
	}

	public void setInstallationSection(String installationSection) {
		this.installationSection = installationSection;
	}

	public String getDriveSide() {
		return driveSide;
	}

	public void setDriveSide(String driveSide) {
		this.driveSide = driveSide;
	}

	public String getAngleCorr() {
		return angleCorr;
	}

	public void setAngleCorr(String angleCorr) {
		this.angleCorr = angleCorr;
	}

	public String getLevelStart() {
		return levelStart;
	}

	public void setLevelStart(String levelStart) {
		this.levelStart = levelStart;
	}

	public String getLevelEnd() {
		return levelEnd;
	}

	public void setLevelEnd(String levelEnd) {
		this.levelEnd = levelEnd;
	}

	public String getControlNr() {
		return controlNr;
	}

	public void setControlNr(String controlNr) {
		this.controlNr = controlNr;
	}

	public String getVaultInstance() {
		return vaultInstance;
	}

	public void setVaultInstance(String vaultInstance) {
		this.vaultInstance = vaultInstance;
	}

	public String getDrawingVersion() {
		return drawingVersion;
	}

	public void setDrawingVersion(String drawingVersion) {
		this.drawingVersion = drawingVersion;
	}

	public String getDrawingRevision() {
		return drawingRevision;
	}

	public void setDrawingRevision(String drawingRevision) {
		this.drawingRevision = drawingRevision;
	}

	public String getOutfit3D() {
		return outfit3D;
	}

	public void setOutfit3D(String outfit3D) {
		this.outfit3D = outfit3D;
	}

	public String getParcelTypeID() {
		return parcelTypeID;
	}

	public void setParcelTypeID(String parcelTypeID) {
		this.parcelTypeID = parcelTypeID;
	}

	public String getOrderPlant() {
		return orderPlant;
	}

	public void setOrderPlant(String orderPlant) {
		this.orderPlant = orderPlant;
	}

	public String getDesignPlant() {
		return designPlant;
	}

	public void setDesignPlant(String designPlant) {
		this.designPlant = designPlant;
	}

	public Boolean getStorageConveyor() {
		return storageConveyor;
	}

	public void setStorageConveyor(Boolean storageConveyor) {
		this.storageConveyor = storageConveyor;
	}

	public Double getDrivePulleyDiameter() {
		return drivePulleyDiameter;
	}

	public void setDrivePulleyDiameter(Double drivePulleyDiameter) {
		this.drivePulleyDiameter = drivePulleyDiameter;
	}

	public Double getDriveShaftDiameter() {
		return driveShaftDiameter;
	}

	public void setDriveShaftDiameter(Double driveShaftDiameter) {
		this.driveShaftDiameter = driveShaftDiameter;
	}

	public Double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}

//	public List<ConnectionPointEntity> getConnectionPoints() {
//		return connectionPoints;
//	}
//
//	public void setConnectionPoints(List<ConnectionPointEntity> connectionPoints) {
//		this.connectionPoints = connectionPoints;
//	}
//
//	public void addConnectionPoint(ConnectionPointEntity connectionpointEntity) {
//		connectionPoints.add(connectionpointEntity);
//		connectionpointEntity.setComponent(this);
//	}
//
//	public void removeConnectionPoint(ConnectionPointEntity connectionpointEntity) {
//		connectionPoints.remove(connectionpointEntity);
//		connectionpointEntity.setComponent(null);
//	}
//
//	public List<DecompositionEntity> getDecompositions() {
//		return decompositions;
//	}
//
//	public void setDecompositions(List<DecompositionEntity> decompositions) {
//		this.decompositions = decompositions;
//	}
//
//	public void addDecomposition(DecompositionEntity decompositionEntity) {
//		decompositions.add(decompositionEntity);
//		decompositionEntity.setComponent(this);
//	}
//
//	public void removeDecomposition(DecompositionEntity decompositionEntity) {
//		decompositions.remove(decompositionEntity);
//		decompositionEntity.setComponent(null);
//	}
//
//	public PositionEntity getPosition() {
//		return position;
//	}
//
//	public void setPosition(PositionEntity position) {
//		this.position = position;
//	}
//
//	public Set<GroupEntity> getGroups() {
//		return groups;
//	}
//
//	public void setGroups(Set<GroupEntity> groups) {
//		this.groups = groups;
//	}

}