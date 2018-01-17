package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, healthLabel);
		numberLabel = new JLabel("Number");
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, healthLabel);
		evolvableLabel = new JLabel("Evolvable");
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, healthLabel);
		modifierLabel = new JLabel("Modifier");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 67, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -180, SpringLayout.EAST, this);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField(0);
		numberField = new JTextField(0);
		attackField = new JTextField(0);
		healthField = new JTextField(0);
		modifierField = new JTextField(0);
		
		descriptionArea = new JTextArea(0, 0);
		typeArea = new JTextArea(0, 0);
		
		saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
	
		firstType = new JPanel();
		secondType = new JPanel();
			
		setupPanel();
		setupLayout();
		setupListeners();
		setupComboBox();
		setupTypePanels();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Dragon"))
		{
			firstType.setBackground(Color.CYAN);
		}
		else if(types[0].equals("Fire"))
		{
			firstType.setBackground(Color.RED);
		}
		else if(types[0].equals("Dark"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else if(types[0].equals("Ground"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if (types.length > 1)
			if (types[1].equals("Dragon"))
			{
				secondType.setBackground(Color.CYAN);
			}
			else if (types[1].equals("Fire"))
			{
				secondType.setBackground(Color.RED);
			}
			else if (types[1].equals("Dark"))
			{
				secondType.setBackground(Color.BLACK);
			}
			else if (types[1].equals("Ground"))
			{
				secondType.setBackground(Color.YELLOW);
			}
			else
			{
				secondType.setBackground(Color.WHITE);
			}
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(iconLabel);
		
	}
	
	public void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 4, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 2, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, -15, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 123, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -18, SpringLayout.NORTH, secondType);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -6, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -11, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 5, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 1, SpringLayout.WEST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -8, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 12, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -230, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 145, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 5, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -26, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 57, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 109, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 5, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 21, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 401, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, -10, SpringLayout.SOUTH, this);
	}
	
	private void updatePokedexInfo(int index)
	{
		//Update basic fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//update Text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current+ "\n");
		}
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int  selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText())
					&& appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					//Send to the Controller to modify the Pokemon since the View cannot see the Model
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
				
				}
			}
		});
	}
}