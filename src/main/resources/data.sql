-- Create College Table
CREATE TABLE IF NOT EXISTS College (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    accommodation VARCHAR(255) NOT NULL,
    accommodation_fee DECIMAL(10, 2) NOT NULL
);

-- Create Course Table
CREATE TABLE IF NOT EXISTS Course (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    fee DECIMAL(10, 2) NOT NULL,
    duration VARCHAR(255) NOT NULL,
    college_id BIGINT,
    FOREIGN KEY (college_id) REFERENCES College(id)
);

-- Insert Data into College Table
INSERT INTO College (name, accommodation, accommodation_fee)
VALUES 
('College A', 'AC', 5000.00),
('College B', 'Non-AC', 3000.00),
('College C', 'AC', 5500.00),
('College D', 'Non-AC', 2500.00),
('College E', 'AC', 6000.00);

-- Insert Data into Course Table
INSERT INTO Course (name, fee, duration, college_id)
VALUES
('Computer Science', 10000.00, '4 years', 1),
('Information Technology', 8000.00, '3 years', 1),
('Mechanical Engineering', 12000.00, '4 years', 2),
('Electrical Engineering', 11000.00, '4 years', 3),
('Civil Engineering', 9000.00, '4 years', 4);

INSERT INTO Course (name, fee, duration, college_id)
VALUES
('Business Administration', 7000.00, '3 years', 5),
('Marketing', 7500.00, '3 years', 5),
('Physics', 6500.00, '3 years', 2),
('Mathematics', 6800.00, '3 years', 3),
('Biology', 9000.00, '3 years', 4);
