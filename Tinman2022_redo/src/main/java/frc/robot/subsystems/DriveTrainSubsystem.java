// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.*;

import edu.wpi.first.wpilibj.Joystick;

public class DriveTrainSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  WPI_TalonSRX _talonL = new WPI_TalonSRX(1);
  WPI_TalonSRX _talonR = new WPI_TalonSRX(0);
  DifferentialDrive _drive = new DifferentialDrive(_talonL, _talonR);
  Joystick _joystick = new Joystick(0);

  public DriveTrainSubsystem() {
    /* factory default values */
    _talonL.configFactoryDefault();
    _talonR.configFactoryDefault();

    /* flip values so robot moves forward when stick-forward/LEDs-green */
    _talonL.setInverted(false); // <<<<<< Adjust this
    _talonR.setInverted(true); // <<<<<< Adjust this

    /*
     * WPI drivetrain classes defaultly assume left and right are opposite. call
     * this so we can apply + to both sides when moving forward. DO NOT CHANGE
     */
    //_drive.setRightSideInverted(false);
  }
  public void PowerTalonl(double Power) {
  tankDrive 
  }
  @Override

  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
